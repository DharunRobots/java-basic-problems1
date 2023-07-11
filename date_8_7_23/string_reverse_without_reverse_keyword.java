package date_8_7_23;

public class string_reverse_without_reverse_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Welcome";
		  String resStr = "";
		  System.out.println("Before Reverse : "+str1);
		 
		  for(int  i = str1.length()-1;i>=0;i--) {
			  resStr=resStr+str1.charAt(i);
		  }
		  
		  System.out.println("After Reverse : "+resStr);

	}

}
