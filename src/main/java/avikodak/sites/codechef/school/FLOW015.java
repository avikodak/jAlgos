/****************************************************************************************************************************************************
 *  File Name                   : LUCKYSTR.java
 *  Created on                  : 30-Oct-2015 :: 7:49:22 pm
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://www.codechef.com/problems/FLOW015
 ****************************************************************************************************************************************************/


package avikodak.sites.codechef.school;

import java.util.Calendar;
import java.util.Scanner;

//Tested
public class FLOW015 {

	//Tested
	public static void main(String[] args) {
		String day[] = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		Scanner scanner = new Scanner(System.in);
		Integer testCases,year;
		testCases = scanner.nextInt();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		while(testCases-- > 0){
			year = scanner.nextInt();
			calendar.set(Calendar.YEAR, year);
			System.out.println(day[calendar.get(Calendar.DAY_OF_WEEK)-1]);
		}
		scanner.close();
	}

}
