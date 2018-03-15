
public class ifExamples {

	public static void main(String[] args) {
	
int a=100;
int b=200;
if(a>b){
	System.out.println("a is greater "+a);
}else{
	System.out.println("b is greater "+b);
}

int c=300;
if(a>b && a>c){
	System.out.println("a is greater "+a);
}else if(b>c){
	System.out.println("b is greater "+b);
}else{
	System.out.println("c is greater "+c);
}
	}

}
