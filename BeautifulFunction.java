import java.util.*;

public class BeautifulFunction {
    public static int reachable(int N) {
        Set<Integer> reach = new HashSet<>();
        while (!reach.contains(N)) {
            reach.add(N);
            N = beautiful(N);
        }
        return reach.size();
    }

    public static int beautiful(int x) {
        x++; // Increment by 1
        while (x % 10 == 0) { // Remove trailing zeros
            x /= 10;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(reachable(N));
        scanner.close();
    }
}
