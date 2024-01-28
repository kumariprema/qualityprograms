package basicPrograms;

public class Removeduplicatesfromstring {
	
	 public static void main(String[] args) {
	        String s1 = "premaaaaaaaaaaaaaaaa";
	        String s2 = "";
	       Boolean found = false;
	        for (int i = 0; i < s1.length(); i++) {	
	            
	            for (int j = 0; j < s2.length(); j++) {
	                if (s1.charAt(i) == s2.charAt(j)) {
	                    found = true;
	                    break; //don't need to iterate further
	                }
	            }
	            
	            if (found == false) {
	                s2 = s2.concat(String.valueOf(s1.charAt(i)));
	            }
	        }
	        System.out.println(s2);
	}
}


