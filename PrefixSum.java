public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int sum1 = prefixSum[3] - (1 > 0 ? prefixSum[1 - 1] : 0);
        int sum2 = prefixSum[4] - (2 > 0 ? prefixSum[2 - 1] : 0);

        System.out.println("Sum of range [1,3]: " + sum1);
        System.out.println("Sum of range [2,4]: " + sum2);
    }
}
