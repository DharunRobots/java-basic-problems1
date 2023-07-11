package date_8_5_23;

public class Dog extends Animal {
	
		//single inheritance
		public static void main(String args[]) {
			Dog d = new Dog();
			d.bark();
			d.eat();
		}
		public void bark() {
			System.out.println("barking...");
		}
	}


