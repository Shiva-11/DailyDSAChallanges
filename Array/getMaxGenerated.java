package DailyDSAChallanges.Array;
import java.util.Scanner;

public class getMaxGenerated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length (n): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Length cannot be negative.");
            sc.close();
            return;
        }

        int[] nums = new int[n + 1];
        int max = 0;

        if (n >= 1) {
            nums[1] = 1;
            max = 1;
        }

        for (int i = 1; i <= n / 2; i++) {
            if (2 * i <= n) {
                nums[2 * i] = nums[i];
                max = Math.max(max, nums[2 * i]);
            }
            if (2 * i + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
                max = Math.max(max, nums[2 * i + 1]);
            }
        }

        System.out.print("Generated array: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Maximum value in the array: " + max);

        sc.close();
    }
}
