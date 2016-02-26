import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/****************************************************************************************************************************************************
 *  File Name                   : Main.java
 *  Author                      : avikodak
 ****************************************************************************************************************************************************/

public class Main {

	public static void main(String[] args) {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = bufferRead.readLine();
			String[] tokens = s.split(" ");
			Boolean areAllLettersInCapital;
			int totalAcronyms = 0;
			for (String word : tokens) {
				if(word.length() > 1) {
					areAllLettersInCapital = true;
					for (int counter = 0; counter < word.length(); counter++) {
						if (word.charAt(counter) >= 'a' && word.charAt(counter) <= 'z') {
							areAllLettersInCapital = false;
						}
					}
					if(areAllLettersInCapital){
						totalAcronyms++;
					}
				}
			}
			System.out.println(totalAcronyms);
		} catch (IOException e) {
		}

	}

}
