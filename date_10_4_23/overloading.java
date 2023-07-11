package date_10_4_23;

class A {
	public int show(int n1,int n2) {
		return n1+n2;
	}
	public int show(int n1,int n2,int n3) {
		return n1*n2+n3;
	}
}



public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		int r1=obj.show(3, 4);
		System.out.println(r1);
		int r2 = obj.show(2, 3, 3);
		System.out.println(r2);
	}

}
