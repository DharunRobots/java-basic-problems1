package date_28_3_23;

import java.util.Scanner;

public class arrange_string_in_alphabet_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number of strings you want:");
        count = scan.nextInt();
        
        
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        
        System.out.println("Enter the Strings:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }

	}

}
