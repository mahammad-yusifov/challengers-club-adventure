import java.util.*;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int biggest = candles.get(candles.size() - 1);
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == biggest)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int arrSize = scanner.nextInt();

        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i <= arrSize; i++) {
            System.out.println("Enter" + i + " th element of array: ");
            numList.add(scanner.nextInt());
        }

        System.out.println(birthdayCakeCandles(numList));
    }
}
