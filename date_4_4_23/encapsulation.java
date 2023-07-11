package date_4_4_23;

class human{
	 private int age = 11;
	 private String name = "Dharun";
	 
	 public human() { //default constructor (or) non-parameterized constructor
 		 age = 12;
		 name = "john";
		// System.out.println("constructor");
	 }
	 public human(int a,String n) {  //parameterized constructor
		 age = a;
		 name=n;
	 }
	 public int getAge() {
		 return age;
	 }
	 public String getName() {
		 return name;
	 }
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		human obj = new human();
		human obj1 = new human(15,"Arun");
		
		// we cannot called constructor but even still it executed
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getName());

	}

}
