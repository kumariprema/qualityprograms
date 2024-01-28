package basicPrograms;

public class SecondlargestElement {
	
	public static int getSecondLargest(int[] a, int total){  
		int temp; 
		//int total1 = a.length;
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
		       return a[a.length-2];  
		}  
		public static void main(String args[]){  
		int a[]={44,66,99,77,33,22,55,88};   
		System.out.println("Second Largest: "+getSecondLargest(a,a.length));   
		}

}
