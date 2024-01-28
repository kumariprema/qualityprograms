package basicPrograms;

public class Snippet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] a = new int [] {1, 2, 3, 4,  7, 8, 9,10};  
		 
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
 
	System.out.println("Second largest element in an array is " + a[a.length-2]);  
	}
}

