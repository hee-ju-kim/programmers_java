import java.util.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        Arrays.stream(priorities).forEach(e -> queue.add(e));
        int answer = 0;
        while (!queue.isEmpty()) {

        }
        System.out.println(queue);
        return answer;
    }

    public static void main(String[] args) {
        int tmp = solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println(tmp);
    }
}
