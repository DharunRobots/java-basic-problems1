package date_19_4_23;

public class amstrong_no_between_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int first=1;
		int last=1000000000;
		for(int n=1;n<=last;n++) {
			int a,i=0,j=0;
			
			a=n;
			while(a>0) {
				i=a%10;
				j=(i*i*i)+j;
				a=a/10;
			}
			if(n==j) {
				count++;
				System.out.println(n);
			}
			
		}
		System.out.println("There are "+count+" amstrong numbers present in between "+first+" and "+last);
		
	}

}
