public class E22 {
    public static void main(String[] args) {
        //1.2.22 Write a program that takes three doubl e values x0, v0, and t from the com
        //mand line and prints the value of x0 + v0t + gt2/2, where g is the constant 9.78033.
        //(Note: This value the displacement in meters after t seconds when an object is
        //thrown straight up from initial position x0 at velocity v0 meters per second.)

        double x = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.78033;
        double displacement = x + (v * t) + (g * Math.pow(t, 2) / 2);
        System.out.println(displacement);
    }
}
