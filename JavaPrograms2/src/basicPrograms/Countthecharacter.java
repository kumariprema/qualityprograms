package basicPrograms;

public class Countthecharacter {

	public static void main(String[] args) {
		 String st = "The best of both worlds";    
	        int count = 0;    
	            
	   
	        for(int i = 0; i < st.length(); i++) {    
	            if(st.charAt(i) != ' ')    
	                count++;    
	        }    
	              
	        System.out.println("Total number of characters in a string: " + count);    
	}

}
