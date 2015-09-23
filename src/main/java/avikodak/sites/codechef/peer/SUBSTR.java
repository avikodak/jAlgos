/****************************************************************************************************************************************************
 *  File Name                   : SUBSTR.java
 *  Created on                  : 20-Sep-2015 :: 10:52:03 am
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://www.codechef.com/problems/SUBSTR/
 ****************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.util.Scanner;

//Tested
public class SUBSTR {

	//Tested
	private static void findAllOccurence(long N,String K){
		StringBuffer hayStack = new StringBuffer();
		for(long counter = 1;counter <= N;counter++){
			hayStack.append(counter);
		}
		int lastIndex = hayStack.indexOf(K,0);
		int count = 0;
		while(lastIndex != -1){
			count ++;
		    lastIndex = hayStack.indexOf(K,lastIndex+1);
		}
		System.out.println(count);
	}
	
	//Tested
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer testCases = in.nextInt();
		long N;
		String K;
		while(testCases-- > 0){
			N = in.nextLong();
			K = in.next();
			findAllOccurence(N, K);
		}
		in.close();
	}

}
