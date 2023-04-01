public class Problem1 {
    public static int min(int[] arr) {
        return minimum(arr, 0, Integer.MAX_VALUE);
    }

    private static int minimum(int[] arr, int i, int min) {
        if(i == arr.length) {
            return min;
        }
        return minimum(arr, i + 1, Math.min(arr[i], min));
    }
}
