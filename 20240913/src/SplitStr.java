// https://school.programmers.co.kr/learn/courses/30/lessons/181869

import java.util.Arrays;

public class SplitStr {

	public static void main(String[] args) {
		String[] result = solution("i love you");
		System.out.println(Arrays.toString(result));
		
		String[] result2 = solution("programmers");
		System.out.println(Arrays.toString(result2));
		
	}


	public static String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
