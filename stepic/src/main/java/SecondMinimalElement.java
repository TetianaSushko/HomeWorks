public class SecondMinimalElement {
    public static void main(String[] args) {
        int[] array = new int[]{13, 22, 33, 45, 76, 2, 34};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin && array[i] != min) {

            }
        }
        if (secondMin != Integer.MAX_VALUE) {
            System.out.println(" second min value = " + secondMin);
        }else {
            System.out.println("second min value not exist");
        }
    }
}
