import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        String regex = "\\d+";
        int[] values = Arrays.stream(args)
                .filter(value -> value.matches(regex))
                .mapToInt(value -> Integer.valueOf(value)).toArray();

        if (args.length == values.length) {
            Main.Digit[] digits = Main.Digit.createDigits(
                    "  @@     @@   @@@@@@ @@@@@@ @@  @@ @@@@@@  @@@@@ @@@@@@  @@@@   @@@@@",
                          " @  @   @@@       @@     @@ @@  @@ @@     @@        @@  @@  @@ @@  @@",
                          "@@  @@ @ @@   @@@@@@  @@@@@ @@@@@@ @@@@@  @@@@@    @@    @@@@   @@@@@",
                          " @  @    @@   @@         @@     @@     @@ @@  @@  @@    @@  @@     @@",
                          "  @@   @@@@@@ @@@@@@ @@@@@@     @@ @@@@@   @@@@  @@      @@@@   @@@@@"
            );
            int height = digits[0].lines.length;
            for (int i = 0; i < height; i++) {
                for (int value : values) {
                    System.out.print(digits[value].lines[i] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Args cannot contains letters");
        }

    }
}
