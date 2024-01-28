package basicPrograms;

public class SwapVariable {
	
	public static void main(String[] args) {
	
	  int x = 10; 
	   int y = 5;
	 

    x = x + y; // x now becomes 15
    y = x - y; // y becomes 10
    x = x - y; // x becomes 5
    
	System.out.println(x);
	System.out.println(y);
}
}
