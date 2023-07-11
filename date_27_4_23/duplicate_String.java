package date_27_4_23;

public class duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		String str = new String("engineering");
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count + 1;

				}
			}
			System.out.println(str.charAt(i) + " " + count);
			count = 0;
		}
	}
}
