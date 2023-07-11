package date_30_3_23;

public class multi_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[][] = new int[3][4];
		
		int random =0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				nums[i][j]=(int) (Math.random()*100);
				System.out.println(nums[i][j]+" ");
			}
			
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println( );
		}

	}

}
