public class Circle {
    private static final double PI = Math.PI;

    public static double ar(double ra) {
        double ar = PI * (ra * ra);
        System.out.println("Area" + ar);
        return ar;
    }

    public static double ci(double ra) {
        double ci = PI * 2 * ra;
        System.out.println("Circumference" + ci);
        return ci;
    }
}
