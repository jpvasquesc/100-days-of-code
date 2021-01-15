public class E19 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double random = Math.random() / Math.nextDown(1.0);
        double x = a * (1.0 - random) + b * random;
        System.out.println((int) x);
    }
}
