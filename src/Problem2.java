public class Problem2 {
    public static double average(int[] arr) {
        return avg(arr, 0, 0);
    }

    private static double avg(int[] arr, int i, int sum) {
        if(i == arr.length) {
            return (double) sum / arr.length;
        }
        return avg(arr, i + 1, sum + arr[i]);
    }
}
