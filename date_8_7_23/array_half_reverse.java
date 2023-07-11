package date_8_7_23;

public class array_half_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8};
		
		int hf=arr.length/2,count=0;
		
		int narr[] = new int [arr.length];
		
		for(int i=hf-1;i>=0;i--)
		{
			narr[count] = arr[i];
			count++;
		}	
		for( int i=arr.length-1;i>=hf;i--)
		{
			narr[count] = arr[i];
			count++;
		}
		System.out.println("length"+arr.length);
		for(int i=0;i<narr.length;i++)
		{
			System.out.println(narr[i]);
		}
		
		
	}

}
