import java.util.Scanner;

public class Hw229 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character whose integer equivalent you want to determine:");
        char x = scan.next().charAt(0);
        determineIntValue(x);

    }

    public static void determineIntValue(char x) {
        System.out.printf("The character %c has the value %d%n", x, ((int) x ));
    }
}
