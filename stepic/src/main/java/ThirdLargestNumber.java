
public class ThirdLargestNumber{
    public static void bubblesort(Integer[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Integer[] arr = { 87, 99, 14, 5, 46, 54 };

        bubblesort(arr);

        System.out.print("array after sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int n = arr.length;

        int max = arr[n - 3];
        System.out.println("\n3rd largest value: " + max);
    }
}