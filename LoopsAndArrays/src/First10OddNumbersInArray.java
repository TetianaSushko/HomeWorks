public class First10OddNumbersInArray {
    public static void main(String[] args) {

        int[] number = new int[10];
        int a = 1;
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                result = result + a + " , ";
            } else {
                result = result + a ;
            }
            a = a + 2;
        }
        System.out.println(result);
    }
}
