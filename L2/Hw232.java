import java.util.Scanner;

public class Hw232 {

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
        int p = 0;
        int n = 0;
        int z = 0;
        if (int1>0) p++;
        else if (int1<0) n++;
        else z++;
        if (int2>0) p++;
        else if (int2<0) n++;
        else z++;
        if (int3>0) p++;
        else if (int3<0) n++;
        else z++;
        if (int4>0) p++;
        else if (int4<0) n++;
        else z++;
        if (int5>0) p++;
        else if (int5<0) n++;
        else z++;
        System.out.println("Positive: " + p + " Negative: " + n + " Zeros: " + z);
    }
}
