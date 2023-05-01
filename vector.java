import java.util.function.DoubleToIntFunction;

public class vector {

    private static void printVector(int[] vector) {
        for (int number : vector) {
            System.out.print(number + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] v1 = { 1, 2, 3 };
        int[] v2 = { 4, 5, 6 };
        int[] v3 = { 6, 8, 9 };

        printVector(v1);

        printVector(v2);

        printVector(v3);
    }

}
