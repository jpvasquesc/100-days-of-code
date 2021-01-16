public class E29 {
    //Dayofthe week. Writea program that takesa date as input and prints the
    //day of the week that date falls on. Your program should take three command line
    //parameters: m(month), d (day), and y (year). For m, use 1 for January, 2 for Febru
    //ary,and so forth. For output, print 0 for Sunday, 1 for Monday, 2 for Tuesday, and
    //so forth. Use the following formulas, for the Gregorian calendar:
    //y0 =y-(U-m)l\2
    //* =y0 + ro/4-Vioo+V4()o
    //m0 = m + 12 X ((14 - m) 112) - 2
    //d0 = (d + x+(31Xm0)/12)%7
    //Example: On what day of the week was February 14,2000?
    //y0 = 2000 - 1 = 1999
    //x = 1999 + 1999/4 - 1999/100 + 1999/400 = 2483
    //m0= 2 + 12X1 -2 = 12
    //d0 = (14 + 2483 + (31X12) /12) % 7 = 2500% 7 = 1
    //Answer: Monday.

    public static void main(String[] args) {
        double m = Double.parseDouble(args[0]);
        double d = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);

        double y0 = y - (14 - m) / 12;
        double x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        double m0 = m + 12 * ((14 - m) / 12) - 2;
        double d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println((int) d0);

    }

}
