package avikodak.sites.hackerrank;

/**
 * File Name           : FibonacciModified.java
 * Author              : AVINASH
 * Testing Status      : Tested
 * URL                 : https://www.hackerrank.com/challenges/fibonacci-modified
 */
	

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
	
	//Tested
	private static BigInteger generateModifiedFibonacciTerm(String strPrevPrevTerm,String strPrevTerm,Integer term){
		BigInteger prevTerm = new BigInteger(strPrevTerm);
		BigInteger prevPrevTerm = new BigInteger(strPrevPrevTerm);
		BigInteger currentTerm = new BigInteger("0");
		term-=2;
		while(term-- > 0){
			currentTerm = prevTerm.multiply(prevTerm).add(prevPrevTerm);
			prevPrevTerm = prevTerm;
			prevTerm = currentTerm;
		}
		return currentTerm;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String strPrevPrevTerm = in.next();
		String strPrevTerm = in.next();
		Integer term = in.nextInt();
		System.out.println(generateModifiedFibonacciTerm(strPrevPrevTerm, strPrevTerm, term));
		in.close();
	}

}
