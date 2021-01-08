import java.util.Scanner;

public class Hw224 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        int int3 = scan.nextInt();
        int int4 = scan.nextInt();
        int int5 = scan.nextInt();

        int min = int1;
        if (int2 < min) min = int2;
        if (int3 < min) min = int3;
        if (int4 < min) min = int4;
        if (int5 < min) min = int5;
        System.out.println("Smallest: " + min);

        int max = int1;
        if (int2 > max) max = int2;
        if (int3 > max) max = int3;
        if (int4 > max) max = int4;
        if (int5 > max) max = int5;
        System.out.println("Largest: " + max);
    }

}
