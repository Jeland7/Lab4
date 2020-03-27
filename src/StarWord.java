
public class StarWord {
	//declare data members
	private String word;
	private String pig;
	
	//constructor
	public StarWord() {}
	
	//stringBuffer
	StringBuffer sb = new StringBuffer();
	
	//setMethod
	public void setWord(String w) {
		this.word = w;
	}
	
	//compute methods
	
	//computeVowels
	public void vowels() {
	int len = word.length();
	//vowels: a = 1, e = 5, i = 9, o = 15 and u = 21
	for(int i = len-1; i>= 0; i--) {
		//retrieve the char from the word located at the index i, and store in the variable l
		char l = word.charAt(i);
		if(l == 'a' || l == 'A') {
			//add 1 to the encoded word
			sb.append(1);
		}else if(l == 'i' || l =='I') {
			sb.append(9);
		}else if(l == 'e' || l =='E') {
			sb.append(5);
		}else if(l == 'o' || l =='O') {
			sb.append(15);
		}else if (l == 'u' || l =='U') {
			sb.append(21);
		}else {
			//if the letter is not vowels then add the letter itself to the encoded word
			sb.append(l);
		}
	  }//end for
	}//end vowels
	
		//computeStars
	public void stars() {
	int length = word.length();
	for(int i = 0; i < length; i++) {
	sb.append('*');
	
	  }//end for
	}//end stars
		
	//computePigLatin
	public void pig() {
		sb = new StringBuffer();
		int i = 1;
		while (i< word.length()) {
			char c = word.charAt(i);
			sb.append(c);
			i++;
		}//end while
		
		sb.append(word.charAt(0));
		sb.append("ay");
		
	}//end pigLatin
	
	//reverseWord
	public void reverse() {
		int length = word.length();
		for(int i = length-1; i>=0; i--) {
			//retrieve the letter from at index i
			char w = word.charAt(i);
			sb.append(w);
		}//end for
	}//end reverseWord
	
	//get method
	//.toString();
	public String getStringBuffer() {
		return sb.toString();
	
	
	}	
}
