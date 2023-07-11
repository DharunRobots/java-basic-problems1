package date_3_5_23;

public class reverse_space2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="I am good";
		String st1=st.replace(" ", "@");
		System.out.println(st1);
		
		StringBuffer sb = new StringBuffer(st1);
		StringBuffer st2=sb.reverse();
		System.out.println(st2);
		
		String st3=st2.toString();
		String st4=st3.replace("@"," ");
		System.out.println(st4);
		
		StringBuffer sb1 = new StringBuffer("Hai How are you");
		StringBuffer str=sb1.reverse();
		System.out.println(str);
	}

}
