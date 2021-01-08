import java.util.Scanner;

public class Hw233 {

    public static void main(String[] args) {

        System.out.println("Enter your weight in pounds & height in inches:");
        Scanner scan = new Scanner(System.in);

        double height = scan.nextDouble();
        double weight = scan.nextDouble();

        calculateBMI(height, weight);
    }

    public static void calculateBMI(double height, double weight) {
        System.out.println("Your body mass index is " + weight*703/Math.pow(height,2) +
                "\nBMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater");
    }
}
