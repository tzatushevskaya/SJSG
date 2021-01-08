import java.util.Scanner;

public class Hw215 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();

        System.out.println("Sum: " + (int1+int2));
        System.out.println("Product: " + int1*int2);
        System.out.println("Difference: " + (int1-int2));
        System.out.println("Quotient: " + int1/(double)int2);
    }

}
