import java.util.Calendar;
import java.util.Scanner;

/****************************************************************************************************************************************************
 *  File Name                   : Main.java
 *  Author                      : avikodak
 ****************************************************************************************************************************************************/

public class Main {

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
