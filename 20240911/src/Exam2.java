import java.util.Arrays;
public class Exam2 {

	public static void main(String[] args) {
		String[] tmp = {"and","notad","abcd"};
		String result = solution(tmp);
		System.out.println(result);
		
		String[] tmp2 = {"there","are","no","a","ds"};
		String result2 = solution(tmp2);
		System.out.println(result2);
	}


	public static String solution(String[] strArr) {
        String[] answer = Arrays.stream(strArr)
        .filter(item -> item.indexOf("ad") < 0)
        .toArray(String[]::new);
        return Arrays.toString(answer);
    }
}
