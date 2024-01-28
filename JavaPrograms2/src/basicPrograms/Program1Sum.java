package basicPrograms;

import java.util.Scanner;

public class Program1Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Eneter the number");
		int n=sc.nextInt();
		int sum =0;
		for (int i=1; i<=n; i++)
		{
			sum=sum+i;
		}
		 System.out.println("sum of the number is " + sum);
	}

}
