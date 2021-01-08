public class Hw231 {

    public static void main(String[] args) {
        System.out.println("number square cube");
        calculateSquareCube(0);

    }

    public static void calculateSquareCube (int x) {
        if (x < 4) {
            System.out.println(x + "     " + (int) Math.pow(x, 2) + "     " + (int) Math.pow(x, 3));
            x++;
            calculateSquareCube(x);
        } else if (x < 10) {
            System.out.println(x + "     " + (int) Math.pow(x, 2) + "    " + (int) Math.pow(x, 3));
            x++;
            calculateSquareCube(x);
        } else if (x == 10) {
            System.out.println(x + "    " + (int) Math.pow(x, 2) + "   " + (int) Math.pow(x, 3));
            x++;
            calculateSquareCube(x);
        }

    }

}




