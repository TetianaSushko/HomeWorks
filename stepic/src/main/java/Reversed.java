//public class Reversed {
//
//    public static void main(String[] args) {
//        String name = "Palindrome";
//        StringBuilder rev = new StringBuilder();
//        for (int i = name.length() - 1; i >= 0; i--) {
//            rev.append(name.charAt(i));
//        }
//        System.out.println(rev);
//    }
//}


//        public class Reversed{
//    public static void main(String[] args) {
//        String name = "Palindrome";
//        String result = " ";
//        char [] chars = name.toCharArray();
//        for ( int i = chars.length-1; i>=0; i--){
//            result = result + chars[i];
//        }
//        System.out.println(result);
//    }
//}

public class Reversed{
    public static void main(String[] args) {
        String name = "Palindrome";
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}