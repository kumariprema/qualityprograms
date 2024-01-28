package basicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp=num;
		int sum =0;
		int r;
		while(num>0)
		{ 
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		}
		System.out.println("the reverse num is" + sum);
		if (temp==sum)
		System.out.println("The given number is palindrome");
		else
		System.out.println("The given number is not palindrome ");	
		
	}

}
