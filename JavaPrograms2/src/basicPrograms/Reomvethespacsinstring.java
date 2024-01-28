package basicPrograms;

public class Reomvethespacsinstring {

	public static void main(String[] args) {
		
		String str = "     Geeks     for Geeks     ";
 
       // str = str.replaceAll("\\s", "");
        str = str.replaceAll(" ", "");
 
        System.out.println(str);
      }
}
