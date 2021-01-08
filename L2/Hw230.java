import java.util.Scanner;
import java.lang.ArithmeticException;

public class Hw230 {

    public static void main(String[] args) throws ArithmeticException{

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character whose integer equivalent you want to determine:");
        int x = scan.nextInt();
        divideIntoDigits(x);

    }

    public static void divideIntoDigits (int number) {
        int length = 0;
        for (int i = 0; i < 10; i++) {
            if (number % Math.pow(10, i) == number) {
                length = i;
                break;
            }
        }
        int[] digits = new int[length];
        for (int i = length; i >= 0 ; --i) {
                digits[i-1] = (number % ((int)Math.pow(10,i)) - number % ((int)Math.pow(10,i-1)))/((int)Math.pow(10,i-1));
            System.out.printf("%d   ",digits[i-1]);
        }

    }

    }

