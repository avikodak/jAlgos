/****************************************************************************************************************************************************
 *  File Name                   : WORDCNT.java
 *  Created on                  : 19-Sep-2015 :: 10:55:23 pm
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://www.codechef.com/problems/WORDCNT
 ****************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.util.Scanner;

//Tested
public class WORDCNT {

	//Tested
	private static void printNoWords(String userInput){
		System.out.println(userInput.split(" ").length);
	}
	
	//Tested
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
