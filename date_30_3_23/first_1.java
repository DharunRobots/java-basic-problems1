package date_30_3_23;

class computer {
	public void playmusic() {
		System.out.println("music playing");
	}

	public String getMeApen(int cost) {
		if (cost >= 10) {
			return "pen";
		} else {
			return "your cost low";
		}
	}
}

public class first_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer obj = new computer();
		obj.playmusic();
		String str = obj.getMeApen(2);
		System.out.println(str);

	}

}
