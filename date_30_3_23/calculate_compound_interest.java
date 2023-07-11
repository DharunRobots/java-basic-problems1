package date_30_3_23;

class interest{
	double amount;
	double cinterest;
	int p;
	public double total_amount (int p,int t,int n,double r) {
		amount = p * Math.pow(1 + (r / n), n * t);
        return amount;
       
	}
	public double cinterest() {
	 cinterest = amount - p;
     return cinterest;
	}


public class calculate_compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interest obj = new interest();
		double r1 = obj.total_amount(2000, 5, 12, 0.8);
		double r2 = obj.cinterest();

	}

}
}