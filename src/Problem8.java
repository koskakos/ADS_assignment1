public class Problem8 {
    public static boolean consistNonDigit(String s) {
        return consistNonDigitRecursion(s, 0);
    }

    private static boolean consistNonDigitRecursion(String s, int i) {
        if(i == s.length()) return false;
        return s.charAt(i) > '9' || s.charAt(i) < '0' ? true : consistNonDigitRecursion(s, i + 1);
    }
}
