public class ReplacementOfMaxAndMinMeanInArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 15, 22, -3, 78, 99};
        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (max < numbers[i]) {
                max = numbers[i];
                maxIndex = i;
            }
            if (min > numbers[i]) {
                min = numbers[i];
                minIndex = i;
            }
        }
        numbers[maxIndex] = min;
        numbers[minIndex] = max;
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
