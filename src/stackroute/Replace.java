package stackroute;

public class Replace {
	public static String replaceDF(String input) {
		StringBuffer sb = new StringBuffer("");
		for(Character c:input.toCharArray()) {
			if(c=='d')
				sb.append("f");
			else if(c=='l')
				sb.append("t");
			else
				sb.append(c);
		}
		return sb.toString();
	}
}
