package stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringFunctions {
	public static String[] sortWords(String input) {
		List<String> sortingList = new ArrayList<String>();
		String[] words = input.split(" ");
		for(String w:words) {
			sortingList.add(w);
		}
		Collections.sort(sortingList);		
		return sortingList.toArray(new String[0]);
	}
	public static String reverseWords(String input) {
		StringBuffer sb = new StringBuffer();
		String[] words = input.split(" ");
		StringBuffer reversedWords = new StringBuffer("");
		for(String w:words) {
			sb = new StringBuffer(w);
			reversedWords.append(sb.reverse()+" ");
		}
		return reversedWords.toString().trim();
		
	}
}
