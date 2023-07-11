package date_17_4_23;

public class A{
	int age;
	public void show(){
		System.out.println("show");
	}
	class B{
		public void congif(){
			System.out.println("cpnfig");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		obj.show();
		
		A.B obj1 = obj.new B();
		obj1.congif();
	}

}
