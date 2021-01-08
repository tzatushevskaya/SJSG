import java.util.Scanner;

public class Hw226 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 integers:");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        if (int1%int2 ==0)  System.out.println(int1 + " is the multiple of the " + int2);
        else System.out.println(int1 + " is NOT the multiple of the " + int2);

    }

}
