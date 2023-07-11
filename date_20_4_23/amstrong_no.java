package date_20_4_23;

public class amstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		for(int n=1;n<=10000;n++) {
			int a,i=0,j=0;
			a=n;
			while(a>0) {
				i = a%10;
				j=j+(i*i*i);
				a=a/10;
			}
			if(n==j) {
				System.out.println(n);
				c++;
			}
		}
		System.out.println("total amstrong no are :"+c);

	}

}
