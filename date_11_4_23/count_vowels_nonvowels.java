package date_11_4_23;

public class count_vowels_nonvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels_count = 0;
		int non_vowels_count = 0;

		String s = "Welcome";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				vowels_count = vowels_count + 1;
			}else {
				non_vowels_count = non_vowels_count +1;
			}

		}
		System.out.println("Vowels Count :"+vowels_count);
		System.out.println("non_Vowels Count :"+non_vowels_count);
	}
}
