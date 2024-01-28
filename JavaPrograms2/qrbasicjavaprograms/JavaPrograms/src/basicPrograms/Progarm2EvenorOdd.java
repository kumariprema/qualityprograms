package basicPrograms;

import java.util.Scanner;

public class Progarm2EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System .out.println("Enter the number");
		int n =sc.nextInt();
		if (n%2==0)
		{
			System.out.println(n + " the numbr is even");
		}
		
			else
			System.out.println(n + " the numbr is odd");
	}

}
