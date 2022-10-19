public class ArithmeticMean {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 0; i <= args.length - 1; i++) {
            System.out.println(args[i]);
            sum = sum + Double.parseDouble(args[i]);
        }
        System.out.println(sum / args.length);
    }
}


