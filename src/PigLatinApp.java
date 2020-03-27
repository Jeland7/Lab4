import java.util.Scanner;

public class PigLatinApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = sc.next();
		
		PigLatin myPig = new PigLatin();
		myPig.setWord(word);
		myPig.translate();
		
		String piggy =  myPig.getPig();
		System.out.print("Converted word is: " + piggy);

	}//end of main

}//end of cass
