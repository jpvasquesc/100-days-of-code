public class E35 {
    //Write a program to print
    //the instructions for drawing the dragon curves of
    //order 0 through 5. The instructions are strings of
    //F, L, and R characters, where F means "draw line
    //while moving 1 unit forward,'' L means "turn left,"
    //and Rmeans "turn right." A dragon curve of order
    //N is formed when you fold a strip of paper in half N
    //times, then unfold to right angles.The keyto solving
    //this problem is to note that a curve of order N is a
    //curve of order N— 1 followed by an Lfollowed by a
    //curve of order N—1 traversed in reverse order, and
    //then to figure out a similar description for the reverse curve

    public static void main(String[] args) {
        String d1 = "F";
        String b1 = "F";
        String d2 = d1 + "L" + b1;
        String b2 = d1 + "R" + b1;
        String d3 = d2 + "L" + b2;
        String b3 = d2 + "R" + b2;
        String d4 = d3 + "L" + b3;
        String b4 = d3 + "R" + b3;
        String d5 = d4 + "L" + b4;
        String b5 = d4 + "R" + b4;
        String d6 = d5 + "L" + b5;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

    }
}
