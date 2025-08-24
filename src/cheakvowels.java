
public class cheakvowels {

	public static void main(String[] args) {
		
		  String s = "Hello";
	        int count = 0;

//	        word = word.toLowerCase();
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                count++;
	            }
	        }

	        System.out.println("Vowels: " + count);
	    

		
	}
}
