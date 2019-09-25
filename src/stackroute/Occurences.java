package stackroute;

public class Occurences {
	public static int countOccurences(String input,char match) {
		if(input.equals(""))
			return 0;
		return input.charAt(0)==match?countOccurences(input.substring(1, input.length()),match)+1:countOccurences(input.substring(1, input.length()),match);
	}
}
