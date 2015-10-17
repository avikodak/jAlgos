/****************************************************************************************************************************************************
 *  File Name                   : ICQ1.java
 *  Created on                  : 17-Oct-2015 :: 9:55:38 pm
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://www.codechef.com/problems/ICQ1
 ****************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.util.Scanner;

//Tested
public class ICQ1 {

	//Tested
	public static void main(String[] args) {
		Integer testCases;
		Scanner input = new Scanner(System.in);
		testCases = input.nextInt();
		String userInput;
		while(testCases-- > 0){
			userInput = input.next();
			int lastIndex = 0;
			int count = 0;
			while(lastIndex != -1){
				lastIndex = userInput.indexOf("01",lastIndex);
				if(lastIndex != -1){
					count ++;
					lastIndex += "01".length();
				}
			}
			System.out.println(count);
		}
		input.close();
	}

}
