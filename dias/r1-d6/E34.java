public class E34 {
    //Three-sort. Write a program that takes three int values from the command
    //line and prints them in ascending order. UseMath.min() and Math.max().

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        int max = Math.max(n3, Math.max(n1, n2));
        int min = Math.min(n3, Math.min(n1, n2));
        int median = n1 + n2 + n3 - min - max;

        System.out.println(min);
        System.out.println(median);
        System.out.println(max);

    }
}
