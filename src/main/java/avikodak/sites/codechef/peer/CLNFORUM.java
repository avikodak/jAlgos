/****************************************************************************************************************************************************
 *  File Name                   : CLNFORUM.java
 *  Created on                  : 14-Oct-2015 :: 10:35:13 pm
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://www.codechef.com/problems/CLNFORUM
 ****************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Tested
public class CLNFORUM {
	
	//Tested
	public static void correctSentence(String userInput){
		String words[] = userInput.split(" ");
		Map<String,String> oldNew = new HashMap<String, String>();
		oldNew.put("8", "ate");
		oldNew.put("w8", "wait");
		oldNew.put("gr8", "great");
		oldNew.put("4", "for");
		oldNew.put("b4", "before");
		for(int counter = 0;counter < words.length;counter++){
			if(oldNew.containsKey(words[counter])){
				System.out.print(oldNew.get(words[counter]));
			}else{
				System.out.print(words[counter]);
			}
			if(counter != words.length-1){
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	
	//Tested
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = scanner.nextInt();
		scanner.nextLine();
		while(testCases-- > 0){
			String userInput = scanner.nextLine();
			correctSentence(userInput);
		}
		scanner.close();
	}

}
