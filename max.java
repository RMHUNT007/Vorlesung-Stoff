public class max {
    private static int absmax(int a, int b) {

        if (Math.abs(a) > Math.abs(b)) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int result = absmax(number1, number2);
        System.out.println(result);

    }
}
