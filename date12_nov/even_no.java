package date12_nov;

import java.util.Scanner;

public class even_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int n =20; int total=0; int count=0;
		 */
		even_no obj1 = new even_no();
		// obj1.method1();
		// obj1.method2();
		// obj1.method3();
		obj1.method4();

	}

	public void method1() {
		int n;
		int total = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				total = total + i;
				count = count + 1;
			}
			// count=count+1;
		}
		System.out.println("total = " + total);
		System.out.println("count = " + count);
		System.out.println("*************************************************************");

	}

	public void method2() {
		int n;
		int total = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				total = total + i;
				count = count + 1;
			}
			// count=count+1;
		}
		System.out.println("total = " + total);
		System.out.println("count = " + count);
		System.out.println("*************************************************************");

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
					count = count + 1;
					System.out.println(count + " " + ch[i]);
					break;
				}

			}
		}
	}

	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no : ");
		//int n=sc.nextInt();
		String str="Automation selenium";
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1=str1.reverse();
		
		System.out.println(str1);
		
		int n=7;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}

	}
}
