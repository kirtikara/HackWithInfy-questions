public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A1 = {2, 3, 4, 6, 2, 2, 5};
        findEquilibriumIndex(A1);
    }

    public static void findEquilibriumIndex(int[] arr) {
        int totalSum = 0, leftSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index: " + i);
            }
            leftSum += arr[i];
        }
    }
}
