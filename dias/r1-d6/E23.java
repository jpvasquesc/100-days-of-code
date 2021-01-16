public class E23 {
    //Write a program that takes two int values m and d from the command line
    //and prints true if day d of month mis between 3/20 and 6/20, f al se otherwise.

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean between = ((m == 3 && d >= 20) || (m == 6 && d <= 20) || (m > 3 && m < 6));
        System.out.println(between);
    }
}
