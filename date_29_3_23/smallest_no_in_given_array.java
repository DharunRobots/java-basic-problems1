package date_29_3_23;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class smallest_no_in_given_array {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		int arr[]=new int [] {3, 8, 11, 12, 7, 99};
		int size=arr.length;
		System.out.println("size of the array :"+"\t"+size);
		Arrays.sort(arr);
		//int no=arr[0];
		System.out.println("smallest no is :"+"\t"+arr[0]);
		
		InetAddress myIP=InetAddress.getLocalHost();
		System.out.println("My IP Address is:");
	      System.out.println(myIP.getHostAddress());
		
	}
}
