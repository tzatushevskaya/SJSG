import java.util.Scanner;

public class Hw228 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius:");
        int r = scan.nextInt();

        System.out.println("diameter = " + 2 * r);
        System.out.println("circumference = " + 2 * Math.PI * r);
        System.out.println("area = " + Math.PI * Math.pow(r,2));

    }
}
