public class AverageInArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 33, 47, 5, 25};
        double average = 0.0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        average = sum / numbers.length;
        System.out.println(average);
    }
}
