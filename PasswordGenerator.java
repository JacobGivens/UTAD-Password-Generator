import java.util.Arrays;

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

	public static boolean hasChar(char[] word, char[] list){
		for (char wChar : word){
			for (char lChar : list){
				if (wChar == lChar){
					return true;
				}
			}
		}
		return false;
	}

	public static boolean check3Repeats(char[] word){
		char[] tmpWord = new char[15];
		for (int i = 0; i < 15; i++){
			tmpWord[i] = word[i];
		}
		Arrays.sort(tmpWord);
		for (int i = 0; i < 13; i++){
			if (tmpWord[i] == tmpWord[i+2]){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args){
		char[] characterList = new char[88];
		char[] specials = {'!', '"', '$', '%', ',', '(', ')', '*', '+', '-', '.', '/',
			';', ':', '=', '>', '?', '^', '_', '{', '|', '}', '~', '\\', '[', ']'};
		char[] caps = new char[26];
		char[] lows = new char[26];
		char[] nums = new char[10];
		for (int i = 0; i < 26; i++){
			characterList[i] = (char)(i+65); //Upper Case Characters
			caps[i] = (char)(i+65);
		}
		for (int i = 0; i < 26; i++){
			characterList[i+26] = (char)(i+97); //Lower Case Characters
			lows[i] = (char)(i+97);
		}
		for (int i = 0; i < 10; i++){
			characterList[i+52] = (char)(i+48); //Number Characters
			nums[i] = (char)(i+48);
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
			char[] word = new char[15];
			do{
				for (int i=0; i<15; i++){
					word[i] = characterList[randomGen.nextInt(characterList.length)];
				}
			} while ( !( 
					!check3Repeats(word) && //Would return true if there's 3 of same character. Negate to false, we don't want it.
					hasChar(word, caps) && //Would return true if there is a captial character.
					hasChar(word, lows) && //Would return true if there is a lower character.
					hasChar(word, nums) && //Would return true if there is a number.
					hasChar(word, specials) //Would return true if there is a special character.
				)
			);
			String stringedWord = new String(word);
			System.out.println(stringedWord);
			System.out.println();
		}

	}
}
