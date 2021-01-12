/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        // Takes 2 arguments and says "hello" in order
        System.out.print("Hello ");
        System.out.print(args[0]);
        System.out.print(" and ");
        System.out.print(args[1]);
        System.out.println(".");

        // Takes 2 arguments and says "goodbye" in reverse order
        System.out.print("Goodbye ");
        System.out.print(args[1]);
        System.out.print(" and ");
        System.out.print(args[0]);
        System.out.println(".");
    }
}
