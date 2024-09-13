// https://school.programmers.co.kr/learn/courses/30/lessons/181846?language=java

import java.math.BigInteger;

public class SumNumber {

	public static void main(String[] args) {
		String result = solution("582", "734");
		System.out.println(result);
		
		String result2 = solution("18446744073709551615", "287346502836570928366");
		System.out.println(result2);
		
		String result3 = solution("0", "0");
		System.out.println(result3);
	}


	public static String solution(String a, String b) {
        return (new BigInteger(a).add(new BigInteger(b))).toString();
    }
}
