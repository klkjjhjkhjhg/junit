package src;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GHSelenium {
	public static void main(String[] args) {
		File file=new File("E:\\SoftwareTesting\\inputgit.csv");
		List<String> git=importCsv(file);
		System.setProperty("webdriver.firefox.bin", "D:\\FireFox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		for(int i = 1;i<git.size();i++){
			driver.get("http://121.193.130.195:8080/");
			String userid=git.get(i).split(",")[0];
			String gitPath=git.get(i).split(",")[2];
			//账号密码输入
			WebElement text=driver.findElement(By.name("name"));
			text.sendKeys(userid);
			text=driver.findElement(By.name("pwd"));
			text.sendKeys(userid.substring(4, 10));
			text.submit();
			//输入后获取表格中git地址
			WebElement table=driver.findElement(By.id("table-main"));
			if(gitPath.equals(table.findElement(By.xpath("//table//tr[3]//td[2]")).getText())){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
		driver.quit();
	}
	public static List<String> importCsv(File file){
		List<String> dataList=new ArrayList<String>();
		BufferedReader br=null;
		try {
		br = new BufferedReader(new FileReader(file));
		String line = "";
		while ((line = br.readLine()) != null) {
		dataList.add(line);
		}
		}catch (Exception e) {
		}finally{
		if(br!=null){
		try {
		br.close();
		br=null;
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
		}
		return dataList;
	}
}