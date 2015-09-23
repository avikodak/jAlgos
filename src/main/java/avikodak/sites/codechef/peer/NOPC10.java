/****************************************************************************************************************************************************
 *  File Name                   : NOPC10.java
 *  Created on                  : 24-Sep-2015 :: 12:38:58 am
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://www.codechef.com/problems/NOPC10
 ****************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.util.Calendar;
import java.util.Scanner;

public class NOPC10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] days = {"","Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		Integer day = scanner.nextInt();
		Integer month = scanner.nextInt();
		Integer year = scanner.nextInt();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		System.out.println(days[calendar.get(Calendar.DAY_OF_WEEK)]);
		scanner.close();
	}

}
