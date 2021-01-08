import java.util.Scanner;

public class Hw217 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three integers you want to process:");

        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
             nums[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum+= nums[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/3);

        int min = nums[0];
        for (int i = 1; i < 3; i++) {
            if (nums[i] < min) min = nums[i];
        }
        System.out.println("Smallest: " + min);

        int max = nums[0];
        for (int i = 1; i < 3; i++) {
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("Largest: " + max);
    }

}
