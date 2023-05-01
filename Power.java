public class Power {
    public static void main(String[] args) {
        int maxExponent = Integer.parseInt(args[0]);
        if( args.length != 1 ){
            System.out.println("Fehler");
            return;
        }

        for (int currentExponent = 0; currentExponent <= maxExponent; currentExponent++) {
            System.out.print("2^" + currentExponent + ":");
            System.out.println((int) Math.pow(2, currentExponent));

        }

    }

}
