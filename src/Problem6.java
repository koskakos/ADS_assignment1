public class Problem6 {
    // Time Complexity: O(n)
//    public static double pow(double a, int n) {
//        if(n == 0) return 1;
//        if(n < 0) {
//            a = 1 / a;
//            n = -n;
//        }
//        return pow(a, n - 1) * a;
//    }

    // Optimized solution
    // Time Complexity O(log(n))
    public static double pow(double a, int n) {
        if(n == 0) return 1;
        if(n < 0) {
            a = 1 / a;
            n = -n;
        }
        return n % 2 == 0 ? pow(a * a, n / 2) : pow(a * a, n / 2) * a;
    }
}
