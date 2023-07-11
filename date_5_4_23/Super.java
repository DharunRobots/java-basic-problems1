package date_5_4_23;
class A{
	public A(){
		System.out.println("A");
	}
	
}
class B extends A{
	public B(){
		System.out.println("B");
	}
	public B(int a){
		System.out.println("B int");
	}
	
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B(6);
		B obj1 = new B();
	}

}
