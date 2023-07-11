package date_29_3_23;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ip_address {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InetAddress myIP=InetAddress.getLocalHost();
		System.out.println("My IP Address is:");
	      System.out.println(myIP.getHostAddress());
	      
	      InetAddress myi4 = InetAddress.getLocalHost();
	      System.out.println("My Host Name :");
	      System.out.println(myi4.getHostName());

	}

}
