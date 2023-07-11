package date_11_4_23;

public class special_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowerCasecount = 0;
		int upperCasecount = 0;
		int numberscount = 0;
		int specialCasecount = 0;

		String s = "Welcome To JAVA Class @ 12345";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				lowerCasecount = lowerCasecount + 1;
			} else if (Character.isUpperCase(ch)) {
				upperCasecount = upperCasecount + 1;
			} else if (Character.isDigit(ch)) {
				numberscount = numberscount + 1;
			}else {
				specialCasecount = specialCasecount + 1;
			}
		}
		System.out.println("Upper case count :"+upperCasecount);
		System.out.println("Lower case count :"+lowerCasecount);
		System.out.println("Number case count :"+numberscount);
		System.out.println("Special case count :"+specialCasecount);
	}

}
