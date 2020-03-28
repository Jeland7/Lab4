import java.util.Scanner;

public class StarWordApp {

	public static void main(String[] args) {
		// declare local variables
		String word;
		String method;
		String answer = "yes";
		
		//declare objects
		StarWord myStar = new StarWord();
		do {
			//input
			//"Please enter a word"
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a word: ");
			word = sc.next();
			
			//"Please choose which method to use" (pigLatin, starsWords...)
			System.out.println("Please choose which method to use (vowels/stars/pig/reverse)");
			method = sc.next();
			
			//process
			myStar.setWord(word);
			
			
		if(method.equalsIgnoreCase("vowels")) {
			myStar.vowels();
			System.out.println("The word: " + word + " with vowels compute method is " + myStar.getStringBuffer());
		}else if(method.equalsIgnoreCase("stars")) {
			myStar.stars();
			System.out.println("The word: " + word + " with stars compute method is " + myStar.getStringBuffer());
		}else if(method.equalsIgnoreCase("pig")) {
			myStar.pig();
			System.out.println("The word: " + word + " with pig compute method is " + myStar.getStringBuffer());
		}else if(method.equalsIgnoreCase("reverse")) {
			myStar.reverse();
			System.out.println("The word: " + word + " with reverse compute method is " + myStar.getStringBuffer());
		}else {
			System.out.println("Please enter a correct method name: ");
		} 	
		
		System.out.println("Would you like to try again (yes/no)?");
		answer = sc.next();
		
		//clear the Stringbuffer content
		myStar.sb.delete(0, myStar.sb.length());
	
		}while(answer.equalsIgnoreCase("yes")) ;
		
		if(answer.equalsIgnoreCase("no")) {
		System.out.println("Bye, bye!");
		}	
		
		//end while
		
		
	}//end main

}//end class
