public class E16 {
    public static void main(String[] args) {
        double g = 6.67 * (Math.pow(10, -11));
        double mass1 = 100;
        double mass2 = 100;
        double r = 2;
        double f = (g * mass1 * mass2) / (r * r);
        System.out.println(f);
    }
}
