import java.util.Scanner;

public class Hw225 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int int1 = scan.nextInt();
        if ( int1%2 == 0 )  System.out.println(int1 + " is even");
        else System.out.println(int1 + " is odd");

    }

}
