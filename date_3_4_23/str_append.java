package date_3_4_23;

public class str_append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Dharun";
		StringBuffer str2 = new StringBuffer();	
		
		str2=str2.append(str1);
		str2=str2.reverse();
		System.out.println(str2);
	}

}
