import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/****************************************************************************************************************************************************
 *  File Name                   : Main.java
 *  Author                      : avikodak
 ****************************************************************************************************************************************************/

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		String words[] = userInput.split(" ");
		for(Integer counter = 0;counter < words.length;counter++){
			StringBuffer sb = new StringBuffer(words[counter]);
			if(counter+1 == words.length){
				sb.deleteCharAt(sb.length()-1);
			}
			System.out.print(sb.reverse().toString());
			if(counter+1 < words.length){
				System.out.print(" ");
			}
		}
		System.out.print(".");
		input.close();
	}

}
