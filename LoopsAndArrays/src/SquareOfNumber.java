public class SquareOfNumber {
    public static void main(String[] args) {
        Integer x = Integer.parseInt(args[0]);
        Integer n = Integer.parseInt(args[1]);
        int xn = 1;
        for (int i = 1; i <= n; i++){
            xn = xn * n;
        }
        System.out.println(xn);
    }
}
