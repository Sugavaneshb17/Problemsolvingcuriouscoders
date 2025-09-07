import java.util.Scanner;

public class PerfectNumberOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is NOT a Perfect Number.");
            return;
        }

        int sum = 1; // 1 is always a divisor

        // Loop only till sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                int pairDiv = num / i;
                if (pairDiv != i) { // avoid adding sqrt twice for perfect squares
                    sum += pairDiv;
                }
            }
        }

        // Check if perfect
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }

        sc.close();
    }
}
