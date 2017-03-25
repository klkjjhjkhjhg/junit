package src;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;  

public class TestSelenium {
	    public static void main2(String[] args) {  
	        // TODO Auto-generated method stub  
	        //设置浏览器driver  
	        System.setProperty("webdriver.firefox.bin", "D:/FireFox/firefox.exe");
	        WebDriver driver;  
	        driver=new FirefoxDriver();    
	        //打开百度的首页  
	        driver.get("http://www.baidu.com");  
	        WebElement element = driver.findElement(By.name("wd"));
	        
	        element.sendKeys("hello Gaihe");
	        element.submit();
	        
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        driver.close();         
	    }
}
