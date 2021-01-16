public class E21 {
    //1.2.21 Write a program that takes a double value t from the command line and
    //prints the value of sin(2t) + sin(3t).

    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double g = (Math.sin(2 * t) + Math.sin(3 * t));
        System.out.println(g);
    }
}
