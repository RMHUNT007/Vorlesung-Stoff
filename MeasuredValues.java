public class MeasuredValues {
    public static void main(String[] args) {
        double[] values = { 20.5, 21.1, 19.5, 22.0 };
        double sum = 0;

        // for(double value:values)

        // for (int i = 0; i < values.length; i++) {
        // sum += values[i];

        // so we can change a for schleife to a while schleife

        int i = 0;
        while (i < values.length) {
            sum += values[i];
            // sum +=value;
            i++;
        }

        System.out.println(sum / 4);
    }

}
