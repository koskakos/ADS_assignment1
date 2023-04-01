public class Problem9 {
    // Time Complexity O(2^n)
    // Space Complexity O(1)
//    public static int binomialCoefficient(int n, int k) {
//        if(k == 0 || k == n) return 1;
//        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
//    }


    // Time Complexity O(n * k) ?
    // Space Complexity O(n * k)
    public static int binomialCoefficient(int n, int k) {
        return binomialCoefficientRecurs(n, k, new int[n + 1][k + 1]);
    }

    public static int binomialCoefficientRecurs(int n, int k, int[][] memo) {
        if(k == 0 || k == n) return 1;
        if(memo[n][k] != 0) return memo[n][k];
        int t = binomialCoefficientRecurs(n - 1, k - 1, memo) + binomialCoefficientRecurs(n - 1, k, memo);
        memo[n][k] = t;
        return memo[n][k];
    }
}
