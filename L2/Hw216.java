import java.util.Scanner;

public class Hw216 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers you want to compare:");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        if (int1 > int2) System.out.println(int1 + " is larger");
        else if (int1 < int2) System.out.println(int2 + " is larger");
        else System.out.println("These numbers are equal");
    }

}
