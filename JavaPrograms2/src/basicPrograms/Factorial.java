package basicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vale of number");
		int n = sc.nextInt();
		int fact=1;
		for (int i=1; i<= n; i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorail of the number is" + fact);
	}
}
