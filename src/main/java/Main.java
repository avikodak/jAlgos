import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/****************************************************************************************************************************************************
 *  File Name                   : Main.java
 *  Author                      : avikodak
 ****************************************************************************************************************************************************/

public class Main {
	
	private static void printNoWords(String userInput){
		System.out.println(userInput.split(" ").length);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Integer testCases = in.nextInt();
		String userInput;
		userInput = in.nextLine();
		while(testCases-- > 0){
			userInput = in.nextLine();
			printNoWords(userInput);
		}
		in.close();
	}
	
}
