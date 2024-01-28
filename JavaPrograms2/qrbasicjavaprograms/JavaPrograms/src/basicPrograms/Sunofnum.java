package basicPrograms;

import java.util.Scanner;

public class Sunofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int sum=0;
		for (int i =1; i<n; i++) 
		{
		//sum+=i;
		sum=sum+i;
		}
         System.out.println( " The sum of the value is " + sum);
       
	}

}
