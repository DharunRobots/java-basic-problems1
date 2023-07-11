package date_30_3_23;

public class remove_white_space_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hi, Welcome to BeginnersBook.com";
	    System.out.println("Original String:" + str);

	    str = str.replaceAll("\\s+", "");

	    System.out.println("String after white spaces are removed:" + str);
	}

}
