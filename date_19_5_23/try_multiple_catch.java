package date_19_5_23;

public class try_multiple_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2;
		int j = 0;
		int num [] = new int[5];
		String str = null;
		
		try 
		{
			j = 18 / i;
			System.out.println(str.length());
			System.out.println(num[1]);
			System.out.println(num[5]);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("cannot divide by zero "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in your limit "+e);
		}
		catch(Exception obj) {
			System.out.println("Something went wrong "+obj);
		}
		finally {
			System.out.println("hai");
		}
		System.out.println(j);

		System.out.println("Hello Dharun");

	}

}
