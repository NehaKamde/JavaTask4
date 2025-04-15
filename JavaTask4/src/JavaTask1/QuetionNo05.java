package JavaTask1;

import java.util.Scanner;

public class QuetionNo05 {
	static int num;
	

	public static void main(String[] args) {
		System.out.println("Enter A Number ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%2!=0) {
		System.out.println("It is a Prime Number");

	}
	else {
		System.out.println("It is not a Prime Number");
	}
	}
}


