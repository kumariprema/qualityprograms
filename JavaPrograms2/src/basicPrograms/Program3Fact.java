package basicPrograms;

import java.util.Scanner;

public class Program3Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Eneter the number");
		int n=sc.nextInt();
		int fact =1;
		for (int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		 System.out.println("sum of the number is " + fact);
	}

}