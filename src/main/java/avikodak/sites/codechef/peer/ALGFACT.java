/****************************************************************************************************************************************************
 * File Name           : ALGFACT.java
 * Author              : avikodak
 * Testing Status      : Tested
 * URL                 : https://www.codechef.com/problems/ALGFACT
 ***************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.math.BigInteger;
import java.util.Scanner;

//Tested
public class ALGFACT {
	
	//Tested
	public static void calculateFactorial(BigInteger userInput){
		BigInteger result = BigInteger.ONE;
		while(userInput.compareTo(BigInteger.ONE) != 0){
			result = result.multiply(userInput);
			userInput = userInput.subtract(BigInteger.ONE);
		}
		System.out.println(result);
	}
	
	//Tested
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer testCases = in.nextInt();
		String userInput;
		while(testCases-- > 0){
			userInput = in.next();
			calculateFactorial(new BigInteger(userInput));
		}
		in.close();
	}

}
