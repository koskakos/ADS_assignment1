public class Problem5 {
    // Recursion
    // Time Complexity: O(2^n)
    // Space Complexity: O(1)
//    public static int fib(int n) {
//        if(n < 2) return n;
//        return fib(n - 2) + fib(n - 1);
//    }

    // Recursion + Memoization
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int fib(int n) {
        return fib(n, new int[n + 1]);
    }

    private static int fib(int n, int[] memo) {
        if(n < 2) return n;
        if(memo[n] != 0) return memo[n];
        int t = fib(n - 2, memo) + fib(n - 1, memo);
        memo[n] = t;
        return memo[n];
    }
}
