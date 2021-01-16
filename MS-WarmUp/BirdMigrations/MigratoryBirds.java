import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        int count = 1, popular = arr.get(0), temp = 0, tempCount;
        Collections.sort(arr);
        System.out.println("Sorted Array: " + arr);

        for (int i = 0; i < (arr.size() - 1); i++) {
            temp = arr.get(i);
            tempCount = 0;
            for (int j = 1; j < arr.size(); j++) {
                if (temp == arr.get(j)) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }

    public static void main(String[] args) {
        List<Integer> birds = Arrays.asList(1, 6, 3, 2, 4, 5, 4, 2, 3, 3, 3);
        System.out.println("Most common bird: " + migratoryBirds(birds));
        //output should be 2
    }
}
