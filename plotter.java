public class plotter {

    private static double f(double x) {
        return Math.sin(x);
    }

    private static void plot(double[] x, double[] y) {
        for (int i = 0; i < y.length; i++) {
            StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
        }
    }

    public static void main(String[] args) {
        StdDraw.setScale(-10, 10);
        StdDraw.setPenRadius(0.01);

        int numberofPoints = 100;

        double[] x = new double[numberofPoints];
        for (int i = 0; i < numberofPoints; i++) {
            x[i] = i * 10.0 / numberofPoints;

        }

        double[] y = new double[x.length];
        for (int i = 0; i < y.length; i++) {
            y[i] = f(x[i]);
        }

        plot(x, y);

    }

}
