public class E15 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean triangle = ((c >= a + b) || (a >= c + b) || (b >= a + c));
        System.out.println(triangle);
    }
}
