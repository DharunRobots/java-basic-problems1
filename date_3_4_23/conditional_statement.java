package date_3_4_23;

public class conditional_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 78, 12, 89, 55, 35 };
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > 80) {
				System.out.println(marks[i]+" and its position is :"+(i+1));
			}
			/*
			 * if (marks[1] > 80) { System.out.println(marks[1]); } if (marks[2] > 80) {
			 * System.out.println(marks[2]); } if (marks[3] > 80) {
			 * System.out.println(marks[3]); } if (marks[4] > 80) {
			 * System.out.println(marks[4]); }
			 */
		}

	}

}
