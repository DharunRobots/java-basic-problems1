package date_17_4_23;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		percentage obj = new percentage();
		obj.method1();

	}
	
	public void method1() {
		int a = 100;
		int b = 10;
		
		float c=((a+b)%100);
		System.out.println(c);
		float d = ((c/100)*5);
		System.out.println(d);
	}

}
