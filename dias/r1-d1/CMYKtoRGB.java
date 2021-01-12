/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double c, m, y, k;
        c = Double.parseDouble(args[0]);
        m = Double.parseDouble(args[1]);
        y = Double.parseDouble(args[2]);
        k = Double.parseDouble(args[3]);

        double w, r, g, b;

        w = 1 - k;
        r = 255 * w * (1 - c);
        g = 255 * w * (1 - m);
        b = 255 * w * (1 - y);

        System.out.print("red   = ");
        System.out.println(Math.round(r));
        System.out.print("green = ");
        System.out.println(Math.round(g));
        System.out.print("blue  = ");
        System.out.println(Math.round(b));


    }
}
