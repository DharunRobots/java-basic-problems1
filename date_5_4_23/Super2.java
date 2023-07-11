package date_5_4_23;
class A1 extends Object         //B1 class extends A1,A1 class extends Object ----- this is multi level inheritance
{
	public A1(){
		super();
		System.out.println("A");
	}
	public A1(int a){
		super();
		System.out.println("A int");
	}
	
}
class B1 extends A1{
	public B1(){
		super();
		System.out.println("B");
	}
	public B1(int a){
		super(a);
		System.out.println("B int");
	}
	
}
public class Super2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B1 obj = new B1(6);
		B1 obj1 = new B1();
	}

}
