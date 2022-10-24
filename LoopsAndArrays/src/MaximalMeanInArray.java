import java.util.ArrayList;

public class MaximalMeanInArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 3, 3, 2, 1, 1, 23, 1};
        ArrayList<Integer> countOfNumber = new ArrayList<Integer>();
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                countOfNumber.clear();
                countOfNumber.add(max);
            } else if (max == numbers[i]) {
                countOfNumber.add(max);
            }
        }
        System.out.println(countOfNumber);
    }
}
