// 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
// flo	result
//1.42	1
//69.32	69

public class PrintInt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solution(69.32);
		System.out.println(result);
	}
	public static int solution(double flo) {
        return (int)flo;
    }

}
