package date_4_4_23;

class human1
{
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name=n;
	}
}

public class encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		human1 obj = new human1();
		
		obj.setAge(23);
		obj.setName("Dharun");

		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
