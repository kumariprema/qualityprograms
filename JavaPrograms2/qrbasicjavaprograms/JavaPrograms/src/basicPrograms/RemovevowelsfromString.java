package basicPrograms;

public class RemovevowelsfromString { 
	
   public static void main(String[] args) {
	    String str = "prema";
	    String s2 = "";
	    Boolean found = false;
	   //int count = 0;
	    for (int i = 0; i < str.length(); i++) 
	    {
        if (str.charAt(i) == 'a'|| 
        	str.charAt(i) == 'e'|| 
        	str.charAt(i) == 'i'|| 
        	str.charAt(i) == 'o'|| 
        	str.charAt(i) == 'u')
        {
        	 found = true;
             break;
        } 
	    
        
        if (found == false) {
            s2 = s2.concat(String.valueOf(str.charAt(i)));
        }
	    
	    }
   System.out.println(s2);
}
}

