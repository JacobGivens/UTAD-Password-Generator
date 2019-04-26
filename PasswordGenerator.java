public class PasswordGenerator{

	static java.util.Scanner userInput = new java.util.Scanner(System.in);
	static String currentInput = "";
	private static boolean manage(){
		System.out.print("Enter=Continue, Continue to generate or enter value and continue to terminate.");
		currentInput = userInput.nextLine();
		if (!currentInput.equals("")){
			userInput.close();
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args){
		char[] characterList = new char[88];
		char[] specials = {'!', '"', '$', '%', ',', '(', ')', '*', '+', '-', '.', '/',
			';', ':', '=', '>', '?', '^', '_', '{', '|', '}', '~', '\\', '[', ']'};
		for (int i = 0; i < 26; i++){
			characterList[i] = (char)(i+65); //Upper Case Characters
		}
		for (int i = 0; i < 26; i++){
			characterList[i+26] = (char)(i+97); //Lower Case Characters
		}
		for (int i = 0; i < 10; i++){
			characterList[i+52] = (char)(i+48); //Number Characters
		}
		for (int i = 0; i<specials.length; i++){
			characterList[i+62] = specials[i];
		}
		/*
		for (char letter : characterList){
			System.out.println(letter);
		}
		*/
		java.util.Random randomGen = new java.util.Random();

		while (manage()){
			for (int i=0; i<15; i++){
				System.out.print(characterList[randomGen.nextInt(characterList.length)]);
			}
			System.out.println();
		}

	}
}
