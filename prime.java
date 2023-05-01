public class prime {

    private static boolean isPrime(int n) {
        for (int z = 2; z < n; z++) {
            if (z % 2 == 0) {
                return false;
            }
        }
        return true;

    }

    private static int numberofPrime(int maxN) {
        int primesFound = 0;

        for (int n = 2; n < maxN; n++) {
            if (isPrime(n) == true) {
                primesFound++;
            }

        }
        return primesFound;
    }

    public static void main(String[] args) {
        int maxN = 99;
        int[] primes = new int[numberofPrime(maxN)];

        int primeNum = 0;
        for (int n = 2; n < maxN; n++) {
            if (isPrime(n)) {
                primes[primeNum] = n;
                primeNum++;

            }

        }
        for (int prime : primes) {
            System.out.print(prime + ",");
        }

    }

}
