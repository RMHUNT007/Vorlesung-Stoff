public class test {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);

        }
        int sum = 0;
        for ( int number: numbers){
            sum += number;
        }
        System.out.println(sum/args.length);
    }

}
