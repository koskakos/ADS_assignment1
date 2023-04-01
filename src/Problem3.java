public class Problem3 {
    public static boolean isPrime(int n) {
        return isPrimeRecurs(n, 3);
    }

    private static boolean isPrimeRecurs(int n, int i) {
        if (n % 2 == 0 && n != 2) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrimeRecurs(n, i + 2);
    }
}
