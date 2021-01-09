import java.util.Scanner;

public class Hw232v2 {

    public static void main(String[] args) {

        System.out.println("Enter 5 integers:");
        Scanner scan = new Scanner(System.in);

        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        int int3 = scan.nextInt();
        int int4 = scan.nextInt();
        int int5 = scan.nextInt();
        countExemplars(int1, int2, int3, int4, int5);
    }

    public static void countExemplars(int int1, int int2, int int3, int int4, int int5) {
        int s = 0;
        s = detectType(int1, s);
        s = detectType(int2, s);
        s = detectType(int3, s);
        s = detectType(int4, s);
        s = detectType(int5, s);
        divideIntoDigits(s);
    }

    public static int detectType(int n, int s) {
        if (n>0) s+=100;
        else if (n<0) s+=10;
        else s++;
        return s;
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
        System.out.println("Positive: Negative: Zero:");
        for (int i = length; i >= 0 ; --i) {
            digits[i-1] = (number % ((int)Math.pow(10,i)) - number % ((int)Math.pow(10,i-1)))/((int)Math.pow(10,i-1));
            System.out.printf("%d         ",digits[i-1]);
        }

    }

}
