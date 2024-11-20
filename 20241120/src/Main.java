import java.util.*;

public class Main {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] finished = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int rest = 100 - progresses[i];
            int more = (int)(Math.ceil((double)rest / (double)speeds[i]));
            finished[i] = more;
        }

        System.out.println(Arrays.toString(finished));
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < finished.length; ) {
            int cnt = 1;
            for (int j = i + 1; j < finished.length; j++) {
                if (finished[i] >= finished[j]) {
                    cnt++;
                } else {
                    break;
                }
            }
            answer.add(cnt);
            i += cnt;
        }
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{95, 95, 95, 95}, new int[]{4, 3, 2, 1});
        System.out.println(Arrays.toString((answer)));
    }
}

// 다른사람 풀이
//public int[] solution(int[] progresses, int[] speeds) {
//    int[] dayOfend = new int[100];
//    int day = -1;
//    for(int i=0; i<progresses.length; i++) {
//        while(progresses[i] + (day*speeds[i]) < 100) {
//            day++;
//        }
//        dayOfend[day]++;
//    }
//    return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
//}