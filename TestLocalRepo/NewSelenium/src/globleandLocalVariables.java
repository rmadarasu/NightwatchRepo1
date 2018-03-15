
public class globleandLocalVariables {

	static int f=200;//globle variable
	
	public static void main(String[] args) {
		int a=10;//local variable
		int d=a+f;
	}
	
	public static void add(){
		int b=20;//local variable
		int c=f+b;
	}
	

}
