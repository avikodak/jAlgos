import java.util.Scanner;

/****************************************************************************************************************************************************
 *  File Name                   : Main.java
 *  Author                      : avikodak
 ****************************************************************************************************************************************************/

public class Main {
	
	public static void main(String[] args) {
		Integer testCases;
		Scanner input = new Scanner(System.in);
		testCases = input.nextInt();
		String userInput;
		while(testCases-- > 0){
			userInput = input.next();
			int lastIndex = 0;
			int count = 0;
			while(lastIndex != -1){
				lastIndex = userInput.indexOf("01",lastIndex);
				if(lastIndex != -1){
					count ++;
					lastIndex += "01".length();
				}
			}
			System.out.println(count);
		}
		input.close();
	}

}
