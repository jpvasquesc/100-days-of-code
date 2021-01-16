public class E26 {
    //Polar coordinates. Write a program that converts from Cartesian
    //to polar coordinates.Your program should take two real numbers
    //x and y on the command line and print the polar coordinates r
    //and 0. Use the Java method Math.atan2 (y, x) which computes the
    //arctangent value ofy/x that is in the range from -pi to pi.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double theta = Math.atan2(y, x);
        System.out.println(r + " and " + theta);
    }
}
