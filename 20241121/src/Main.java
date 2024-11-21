import java.util.Arrays;

public class Main {
    public static int[] solution(int[] arr, int divisor) {
        int[] tmp = Arrays.stream(arr).filter(ele -> ele % divisor == 0).sorted().toArray();
        if (tmp.length == 0) {
            return new int[] {-1};
        } else {
            return tmp;
        }
    }

    public static void main(String[] args) {
        int[] tmp = solution(new int[]{5, 9, 7, 10}, 5);
        System.out.println(Arrays.toString(tmp));
    }
}
