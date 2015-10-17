/****************************************************************************************************************************************************
 *  File Name                   : NF03.java
 *  Created on                  : 17-Oct-2015 :: 9:31:43 pm
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://www.codechef.com/problems/NF03
 ****************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.util.Scanner;

//Tested
public class NF03 {

	//Tested
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		String words[] = userInput.split(" ");
		for(Integer counter = 0;counter < words.length;counter++){
			StringBuffer sb = new StringBuffer(words[counter]);
			if(counter+1 == words.length){
				sb.deleteCharAt(sb.length()-1);
			}
			System.out.print(sb.reverse().toString());
			if(counter+1 < words.length){
				System.out.print(" ");
			}
		}
		System.out.print(".");
		input.close();
	}

}
