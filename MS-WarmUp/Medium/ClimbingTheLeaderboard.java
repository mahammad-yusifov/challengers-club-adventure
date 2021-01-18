import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ClimbingTheLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> resultList = new ArrayList<>();

        HashMap<Integer, Integer> rankedOrder = new HashMap<>();
        for (int i = 1; i <= ranked.size(); i++) {

        }

        return resultList;
    }

    public static List<Integer> getRankNums(List<Integer> ranked) {
        List<Integer> resultNum = Arrays.asList(new Integer[ranked.size()]);

        for (int i = 0; i < ranked.size(); i++) {
            int count = 0;
            for (int j = 0; j < ranked.size(); j++) {
                if (ranked.get(j) > ranked.get(i)) {
//                   if (ranked.get(i)!=ranked.get(i-1)) {
                       count++;
                   }
//                }
            }
            resultNum.set(i, count +1);
        }
        return resultNum;
    }

    public static void main(String[] args) {
        List<Integer> ranked = Arrays.asList(100, 90, 90, 80, 75, 60);

        List<Integer> player = Arrays.asList(50, 65, 77, 90, 102);

        System.out.println(getRankNums(ranked));
        System.out.println(climbingLeaderboard(ranked, player).toString());

    }
}
