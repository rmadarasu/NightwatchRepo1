
public class FunctionsExample {

	public static void main(String[] args) {
		add();
		FunctionsExample.add();
		//sub();
		//FunctionsExample.sub();
		FunctionsExample f=new FunctionsExample();
		f.add();
		f.div();
		f.sub();
	}
	
public static void add(){
	System.out.println("Addition");
}
public  void sub(){
	System.out.println("Subtraction");
}
public  void div(){
	System.out.println("Division");
}

}
