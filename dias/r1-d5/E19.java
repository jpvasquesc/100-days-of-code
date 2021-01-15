public class E19 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int random = (int) ((Math.random() * b) + a);
        System.out.println(random);
    }
}
