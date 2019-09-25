package stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Exercise_4 ex3 = new Exercise_4();
		while(true) {
			ex3.drawMenu();
			n = sc.nextInt();
			ex3.selector(n);
		}
		
	}
	public void selector(int input) {
		Scanner sc = new Scanner(System.in);
		String inputString="",inputString2="";
		int n=0,m=0,count=0;
		long l =0;
		int[] intArray = null;
		String[] stringArray = null;
		switch(input) {
		
		case 1:System.out.println("Enter Entire String");
				inputString = sc.nextLine();
				System.out.println("Enter  character to search");
				char c = sc.nextLine().charAt(0);
				n = Occurences.countOccurences(inputString, c);
				System.out.println("Occurences are "+n);
				break;
		case 2:System.out.println("Enter Entire String");
				inputString = sc.nextLine();
				System.out.println("Output :" + Replace.replaceDF(inputString));
				break;
		case 3:System.out.println("Enter Entire String");
				inputString = sc.nextLine();
				stringArray = StringFunctions.sortWords(inputString);
				for(String s:stringArray)
					System.out.print(" "+s);
				System.out.println();
				break;
		case 4:System.out.println("Enter Entire String");
				inputString = sc.nextLine();
				System.out.print(StringFunctions.reverseWords(inputString));
				break;
		case 5: System.out.println("Enter Entire String");
				inputString = sc.nextLine();
				System.out.println("Is Harry here? "+RegexMatcher.isHarry(inputString));
				break;
		case 6: System.out.println("Enter Entire String");
				inputString = sc.nextLine();
				System.out.println("Enter Word to search");
				String word = sc.nextLine();
				stringArray = RegexMatcher.occurences(inputString, word);
				for(String s:stringArray)
					System.out.println(" "+s);
				break;
		default:System.out.println("Wrong input ------- exiting");break;
		}
	}
	public void drawMenu() {
		System.out.println("---------EXERCISE 4------------");
		System.out.println("| 1 - count occurences        |");
		System.out.println("| 2 - replace d and f         |");
		System.out.println("| 3 - sort words              |");
		System.out.println("| 4 - reverse words           |");
		System.out.println("| 5 - find harry              |");
		System.out.println("| 6 - Regex count occurances  |");
		System.out.println("| anything else exits         |");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("| ENTER YOUR CHOICE           |");
		System.out.println("-------------------------------");
	}

}
