import java.util.Arrays;
import java.util.HashSet;

public class Problem7 {

    public static void printAllPermutations(String s) {
        printAllPermutations(new StringBuilder(), s, 0, new boolean[s.length()]);
    }


    // With repetitions like OOA and OOA
//    private static void printAllPermutations(StringBuilder sb, String s, int i, boolean[] used) {
//        if(i == s.length()) {
//            System.out.println(sb);
//            return;
//        }
//
//        for(int j = 0; j < s.length(); j++) {
//            if(used[j]) continue;
//            sb.append(s.charAt(j));
//            used[j] = true;
//            printAllPermutations(sb, s, i + 1, used);
//            sb.deleteCharAt(sb.length() - 1);
//            used[j] = false;
//        }
//    }



    // Only unique using HashSet
//    private static void printAllPermutations(StringBuilder sb, String s, int i, boolean[] used) {
//        printAllPermutations(sb, s, i, used, new HashSet<>());
//    }
//
//    private static void printAllPermutations(StringBuilder sb, String s, int i, boolean[] used, HashSet<String> set) {
//        if(i == s.length()) {
//            if(!set.contains(sb.toString())) System.out.println(sb);
//            set.add(sb.toString());
//            return;
//        }
//        for(int j = 0; j < s.length(); j++) {
//            if (used[j]) continue;
//            sb.append(s.charAt(j));
//            used[j] = true;
//            printAllPermutations(sb, s, i + 1, used, set);
//            sb.deleteCharAt(sb.length() - 1);
//            used[j] = false;
//        }
//    }


    // Only unique optimized solution without using HashSet
    private static void printAllPermutations(StringBuilder sb, String s, int i, boolean[] used) {
        char[] sCh = s.toCharArray();
        Arrays.sort(sCh);
        printAllPermutations(sb, sCh, i, used);
    }

    private static void printAllPermutations(StringBuilder sb, char[] s, int i, boolean[] used) {
        if(i == s.length) {
            System.out.println(sb);
            return;
        }

        for(int j = 0; j < s.length; j++) {
            if (used[j]) continue;
            if(j > 0 && used[j - 1] && s[j - 1] == s[j]) continue;
            sb.append(s[j]);
            used[j] = true;
            printAllPermutations(sb, s, i + 1, used);
            sb.deleteCharAt(sb.length() - 1);
            used[j] = false;
        }
    }
}
