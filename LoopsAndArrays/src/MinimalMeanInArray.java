import java.util.ArrayList;

public class MinimalMeanInArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 3, 3, 2, 1, 1, 23, 1};
        ArrayList<Integer> countOfNumber = new ArrayList<Integer>();
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                countOfNumber.clear();
                countOfNumber.add(min);

            } else if (min == numbers[i]) {
                countOfNumber.add(min);
            }
        }
        System.out.println(countOfNumber);
    }
}
