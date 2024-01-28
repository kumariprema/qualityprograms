package basicPrograms;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] a = new int [] {10, 3, 4, 2,7, 6, 8, 9,1};  
		 
		 //int total=a.length;
		 int temp ;
		 for (int i = 0; i < a.length; i++)   
	        {  
	            for (int j = i + 1; j < a.length; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        } 
		 System.out.println("Sorted elements in an array is " );
		 
	 for (int x : a)
			{
				
				System.out.println(x);
			}	
				

    System.out.println("Second largest element in an array is " + a[a.length-2]); 
	 
	}
	}
