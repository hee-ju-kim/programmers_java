
public class StringExample {
	public static void main(String[] args)  {
		String result = solution("AbCdEFG", "dE");
		System.out.println(result);
		
		String result2 = solution("AAAAaaaa", "a");
		System.out.println(result2);
	}
	
	public static String solution(String myString, String pat) {
	    int index = myString.lastIndexOf(pat);
	    String answer = myString.substring(0, index) + pat;
	    
	    return answer;
	}
}
