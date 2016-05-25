/****************************************************************************************************************************************************
 *  File Name                   : PRINTKTHDIGIT.java
 *  Created on                  : 26-May-2016 :: 00:20:22 am
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : http://www.practice.geeksforgeeks.org/problem-page.php?pid=302
 ****************************************************************************************************************************************************/

import java.math.BigInteger;
import java.util.Scanner;

package avikodak.sites.geeksforgeeks.practice.basic;

public class PRINTKTHDIGIT {

	private static void findKthDigit(String firstInput, String secondInput, String kthValue) {
		BigInteger firstInputInBI = new BigInteger(firstInput);
		Integer secondInputInBI = Integer.parseInt(secondInput);
		firstInputInBI = firstInputInBI.pow(secondInputInBI);
		int size = firstInputInBI.toString().length();
		System.out.println(firstInputInBI.toString().charAt(size - Integer.parseInt(kthValue)));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer testCases = in.nextInt();
		String firstInput, secondInput, kthValue;
		while (testCases-- > 0) {
			firstInput = in.next();
			secondInput = in.next();
			kthValue = in.next();
			findKthDigit(firstInput, secondInput, kthValue);
		}
		in.close();
	}
}
