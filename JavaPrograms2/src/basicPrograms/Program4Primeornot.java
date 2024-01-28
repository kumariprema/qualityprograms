package basicPrograms;

import java.util.Scanner;

public class Program4Primeornot {

	public static void main(String args[]){ 
		
		 int n=10;//it is the number to be checked          
		  int  m=n/2; 
		  int flag=0; 
		  if(n==0||n==1)
		  {  
		   System.out.println(" Prime number starts from 2");      
		  }
		  else
		  {  
		   for(int i=2;i<=m;i++)
		     {      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		      flag=1;      
		     break;      
		     }      
		   }      
		   if(flag==0) 
            { 
			   System.out.println(n+" is prime number");
			   }  
		  }//end of else  
		}    
		}   