package Exercise;

public class Randomness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtraRandom random = new ExtraRandom();
	//	random.nextLetter();
		
		//System.out.println(random.nextInt(25));
		
		System.out.println("Random English Alphabet : "+ random.nextLetter());
		
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt());
		//nextInt() : all possible 2^32 int values
		System.out.println(random.nextInt(26));
	}

}
