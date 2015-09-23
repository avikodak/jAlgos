/****************************************************************************************************************************************************
 *  File Name                   : CLNDR.java
 *  Created on                  : 23-Sep-2015 :: 10:21:53 pm
 *  Author                      : avikodak
 *  Testing Status              : Tested
 *  URL                         : https://www.codechef.com/problems/CLNDR/
 ****************************************************************************************************************************************************/

package avikodak.sites.codechef.peer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Tested
public class CLNDR {
	
	private static void printDecimalYear(String dateInStr,Integer testCase) throws ParseException{
		Date date = new SimpleDateFormat("dd-MMM-yyyy").parse(dateInStr);
		Calendar startDate = Calendar.getInstance();
		Calendar inputDate = Calendar.getInstance();
		startDate.setTime(date);
		startDate.set(Calendar.MONTH, Calendar.JANUARY);
		startDate.set(Calendar.DAY_OF_MONTH, 1);
		inputDate.setTime(date);
		long days = Math.round((double)Math.abs(inputDate.getTimeInMillis()-startDate.getTimeInMillis())/(double)(24*60*60*1000))+1;
		if(days <= 300){
			System.out.println("Case "+testCase+": "+days + " Hundreds");
		}else if(days >= 300 && days <= 360){
			System.out.println("Case "+testCase+": "+(days-300)+ " Tens");
		}else{
			System.out.println("Case "+testCase+": "+(days-360)+ " Ones");
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer totalTestCases = Integer.parseInt(bufferedReader.readLine());
		for(Integer testCase = 1;testCase <= totalTestCases;testCase++){
			printDecimalYear(bufferedReader.readLine(),testCase);
		}
	}
}
