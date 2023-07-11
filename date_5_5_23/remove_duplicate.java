package date_5_5_23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class remove_duplicate {

	//how-to-remove-duplicates-from-arraylist.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(8);
		primes.add(74);
		primes.add(67);
		primes.add(90);
		primes.add(8);
		primes.add(90);
		primes.add(23);
		primes.add(36);
		primes.add(0);
		
		System.out.println("with duplicate"+primes);
		
		Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes);
		
		System.out.println("without duplicate"+primesWithoutDuplicates);
	}

}
