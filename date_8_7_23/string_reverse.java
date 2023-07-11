package date_8_7_23;

public class string_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "java Hello2 3479!)* World(@gmail.com)";  
		//str = str.replaceAll("[^a-zA-Z0-9]", " ");
		  str = str.replaceAll("[^a-zA-Z]+"," ");
		  
		  System.out.println(str);
		  System.out.println(str.length());
		  
		  str= str.substring(0, str.length() - 10);
		  System.out.println(str.length());

		  str = str.substring(5); 
		  System.out.println(str);
		  
			/*
			 * 
			 * 
			 * String resultStr=""; for(int i=0; i<str.length();i++){ char ch=str.charAt(i);
			 * if(Character.isDigit(ch)){ continue; }
			 * 
			 * resultStr=resultStr+str.charAt(i);
			 * 
			 * }
			 */


		   

			/* System.out.println(resultStr); */ 
		  
		  String name="Vyshnav";
		  
		  StringBuffer na1=new StringBuffer(name);
		  StringBuffer na2=na1.reverse();
		  System.out.println("reverse :"+na2);
		  
	}

}
