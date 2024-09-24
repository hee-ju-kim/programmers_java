
public class Remove0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = solution("0010");
		System.out.println(result);
	}
	public static String solution(String n_str) {
        return Integer.parseInt(n_str) + "";
    }
}
