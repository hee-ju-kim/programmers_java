
public class CheckSuffixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solution("banana", "banana");
		System.out.println(result);
	}

	public static int solution(String my_string, String is_suffix) {
		if (is_suffix.length() >= my_string.length()) {
			return my_string.equals(is_suffix) ? 1 : 0;
		
		} else {
			String tmp = my_string.substring(my_string.length() - is_suffix.length());
	        return tmp.equals(is_suffix) ? 1 : 0;
		}
    }
	
	// 다른 사람 해결법 -> endsWith 함수..
	public static int solution2(String my_string, String is_suffix) {
	 	if(my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
