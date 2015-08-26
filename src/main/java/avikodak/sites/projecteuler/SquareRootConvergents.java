/****************************************************************************************************************************************************
 *  File Name                   : SquareRootConvergents.java
 *  Created on                  : Aug 26, 2015 :: 11:50:34 PM
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://projecteuler.net/problem=57
 ****************************************************************************************************************************************************/

package avikodak.sites.projecteuler;

import java.math.BigInteger;

//Tested
//Ans : 153
public class SquareRootConvergents {
	public static void getFractionCount(){
		BigInteger numerator = new BigInteger("3");
		BigInteger denominator = new BigInteger("2");
		int total = 0;
		for(int counter = 0;counter < 1000;counter++){
			BigInteger temp = numerator.add(denominator.multiply(new BigInteger("2")));
			denominator = denominator.add(numerator);
			numerator = temp;
			if(numerator.toString().length() > denominator.toString().length()){
				total++;
			}
		}
		System.out.println(total);
	}
	
	public static void main(String[] args){
		getFractionCount();
	}
}
