package Exercise;

import java.util.Random;

public class ExtraRandom extends Random {
	
	public String nextLetter(){
		int aAsInt = (int)'a';
		//System.out.println(aAsInt);
		int letterStartAt = aAsInt; //97;
		
		//System.out.println(aAsInt);
		//int alphabetRange = nextInt(26);
		int alphabetRange = new Random().nextInt(26);
		System.out.println(alphabetRange);
		int asciiValueToPrint = letterStartAt + alphabetRange;
		System.out.println("Random Ascii value for English Alphabet: "+asciiValueToPrint);
		char randomChar =(char)(asciiValueToPrint);
		//System.out.println("Random English Alphabet : "+randomChar);
		return "" + randomChar;
	}
}
