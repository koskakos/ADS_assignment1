public class Problem4 {
    public static int factorial(int n) {
        if(n == 1) return n;
        return factorial(n - 1) * n;
    }
}
