import java.util.Scanner;
import java.util.Vector;

/****************************************************************************************************************************************************
 *  File Name                   : Main.java
 *  Author                      : avikodak
 ****************************************************************************************************************************************************/

public class Main {
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		Vector<String> favoriteStrings = new Vector<String>();
		Integer favCount,size;
		favCount = inputScanner.nextInt();
		size = inputScanner.nextInt();
		String input;
		for(Integer counter = 0;counter < favCount;counter++){
			input = inputScanner.next();
			favoriteStrings.add(input);
		}
		for(Integer outerCounter = 0;outerCounter < size;outerCounter++){
			input = inputScanner.next();
			if(input.length() >= 47){
				System.out.println("Good");
			}else{
				Boolean isGood = false;
				for(Integer innerCounter = 0;innerCounter < favoriteStrings.size();innerCounter++){
					if(input.contains(favoriteStrings.get(innerCounter))){
						isGood = true;
						break;
					}
				}
				System.out.println(isGood?"Good":"Bad");
			}
		}
		inputScanner.close();
	}

}
