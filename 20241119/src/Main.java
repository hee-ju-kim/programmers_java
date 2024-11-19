import java.util.*;

public class Main {
    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                stack.push(arr[i]);
            } else {
                if (stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString((answer)));
    }
}
