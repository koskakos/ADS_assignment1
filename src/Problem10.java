public class Problem10 {

//    public static int gcd(int a, int b) {
//        if(a == b) return a;
//        return a < b ? gcd(a, b - a) : gcd(a - b, b);
//    }

    // Optimized
    public static int gcd(int a, int b) {
        if(a == 0 || b == 0) return a == 0 ? b : a;
        if(a == b) return a;
        return a < b ? gcd(a, b - (b / a * a)) : gcd(a - (a / b * b), b);
    }
}
