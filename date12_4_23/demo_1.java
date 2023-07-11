package date12_4_23;

abstract class car{
	public abstract void drive();
	public abstract void fly();
public void playmusic() {
		System.out.println("Playmusic");
	}
	
}
abstract class wagonr extends car{
	public void drive() {
		System.out.println("Drive");
	}
	
}
class UpdatedWagonR extends wagonr{           //Concrete class

	public void fly() {
		System.out.println("Flying....");
	}
	
}

public class demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car obj = new UpdatedWagonR();
		
		obj.playmusic();
		
		obj.drive();
		
		obj.fly();
	}

}
