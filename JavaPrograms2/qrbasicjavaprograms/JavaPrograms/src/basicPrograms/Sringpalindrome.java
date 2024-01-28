package basicPrograms;

import java.util.Scanner;

public class Sringpalindrome {
	
	public static void main(String[] args)
	{
	//Scanner sc = new Scanner (System.in);
	//System.out.println("Enter the Srting");
	//String st = sc.nextLine();
		String st = "premakumari";
	
	char[] ch = st.toCharArray();
	for (int i=0; i<ch.length/2; i++) 
	{
	 char t = ch [i];
	 ch[i]=ch [ch.length-1-i];
	 ch [ch.length-1-i]=t;
	}
	 String nstr = new String(ch);
	  System.out.println(nstr);
	
	}
}
