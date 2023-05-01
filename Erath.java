public class Erath {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] gestrichen = new boolean[n + 1];

        gestrichen[0] = true;
        gestrichen[1] = true;

        // for (int i = 2; i < gestrichen.length; i++) {
        // gestrichen[i] = false;

        // hab nicht so gut verstanden.
        for (int number = 2; number < n; number++) {
            for (int i = 2 * number; i < gestrichen.length; i += number) {
                gestrichen[i] = true;
            }
        }

        for (int i = 4; i < gestrichen.length; i += 2) {
            gestrichen[i] = true;
            System.out.print(i);
        }

        System.out.println("Primezahl :");
        for (int i = 2; i < gestrichen.length; i++) {
            if (gestrichen[i] == false) {
                System.out.print(i + ",");
            }

        }

    }
}