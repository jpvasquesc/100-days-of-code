/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        double sqra = Math.pow(a, 2);
        double sqrb = Math.pow(b, 2);
        double sqrc = Math.pow(c, 2);

        boolean isRight;

        isRight = (((sqra + sqrb) == sqrc) || ((sqra + sqrc) == sqrb) || ((sqrb + sqrc) == sqra))
                && (a > 0) && (b > 0) && (c > 0);

        System.out.println(isRight);

    }
}
