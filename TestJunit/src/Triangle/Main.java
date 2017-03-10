package Triangle;

public class Main {
	private int result=-1;
	public void triangle(int a,int b,int c){
		if(a<=0 || b<=0 || c<=0){
			int m=a/b;
			m=a/c;
			m=b/a;
		}
		if(a==b && b==c){
			result = 0;
		}
		else if(a==b && b!=c){
			result = 1;
		}
		else{
			result = 2;
		}
	}
	
	public void reSet(){
		result=-1;
	}
	public int getResult(){
		return result;
	}
}
