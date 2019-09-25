package stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
	public static boolean isHarry(String input) {
		return input.toLowerCase().contains("harry");
		//return Pattern.matches(" harry ",input.toLowerCase());
	}
	public static String[] occurences(String input, String match) {
		 Pattern pattern = Pattern.compile(match);
		    Matcher matcher = pattern.matcher(input);
		    List<String> occurencesList = new ArrayList<String>();
		    while (matcher.find()) {
		    	occurencesList.add("Found at: " + matcher.start()+" - "+ matcher.end());
		    }
		    return occurencesList.toArray(new String[0]);
	}
}
