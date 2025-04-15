package JavaTask1;

import java.util.Scanner;

public class QuetionNo01 {
	static int a ;
	static int b ;
	static int c ;
	static int d ;

	public static void main(String[] args) {
		System.out.println("Enter Value for A,B,C and D ");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		

		if (a + b > c + d) {
			System.out.println("sum of a and b is greater than sum of c and d ::" + (a+b));

		} else {
			System.out.println("sum Of c and d is greater than sum of a and b :: " + (c+d));

		}
	}
}
