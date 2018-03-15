
public class FunctionsInputExample {

	public static void main(String[] args) {
		FunctionsInputExample fe=new FunctionsInputExample();
		fe.sum();
		fe.sum(1);
		fe.sub(100, 29);
		fe.sub(123, 345);
	}
public void sum(){
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
public void sum(int a){
	int d=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
	System.out.println(a);
}
public void sum(String a){
	int d=10;
	int b=20;
	
	//System.out.println(c);
	System.out.println(a);
}
public void sub(int a,int b){
	
	int c=a-b;
	System.out.println(c);
}


}
