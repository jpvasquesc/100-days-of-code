/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        x1 = Double.parseDouble(args[0]);
        y1 = Double.parseDouble(args[1]);
        x2 = Double.parseDouble(args[2]);
        y2 = Double.parseDouble(args[3]);

        double radx1, rady1, radx2, rady2;
        radx1 = Math.toRadians(x1);
        rady1 = Math.toRadians(y1);
        radx2 = Math.toRadians(x2);
        rady2 = Math.toRadians(y2);

        double r = 6371.0;
        double distance = ((2 * r) * Math.asin(
                Math.sqrt(
                        Math.pow(Math.sin((radx2 - radx1) / 2), 2) +
                                (Math.cos(radx1)
                                        * Math.cos(radx2)
                                        * Math.pow(Math.sin((rady2 - rady1) / 2), 2))

                )));
        System.out.print(distance);
        System.out.println(" kilometers");

    }
}
