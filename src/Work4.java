
public class Work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String [] words = {"Dog", "Cat","Bird","Fish"};
	//System.out.println(words[2] + " " + words[1] + " " + words[0] + " " + words[3]);
	
	
	String k = words[0];
	words[0] = words[2];
	words[2] = words[0];
	for (int i = 0; i<=words.length-1; i++){
		System.out.println(words[i]);
	}
	
	}

}
