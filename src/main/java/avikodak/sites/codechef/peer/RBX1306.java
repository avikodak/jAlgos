/****************************************************************************************************************************************************
 *  File Name                   : RBX1306.java
 *  Created on                  : 20-Oct-2015 :: 8:21:27 pm
 *  Author                      : avikodak
 *  Testing Status              : Works 
 *  URL                         : https://www.codechef.com/problems/RBX1306
 ****************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.util.Scanner;

//Works
public class RBX1306 {
	
	//Works
	public static void main(String[] args) {
		try {
			Scanner inputScanner = new Scanner(System.in);
			int totalChildren,testCases;
			totalChildren = inputScanner.nextInt();
			int totalPoints[] = new int[totalChildren];
			Integer index;
			String input;
			testCases = inputScanner.nextInt();
			while(testCases-- > 0){
				input = inputScanner.next();
				index = Integer.parseInt(input.substring(1))-1;
				if(input.charAt(0) == 'C') {
					totalPoints[index]++;
				}else{
					totalPoints[index]--;
				}
			}
			for(int counter = 0;counter < totalChildren;counter++){
				System.out.print(totalPoints[counter] + " ");
			}
			inputScanner.close();
		} catch (Exception e) {
		}
	}

}
