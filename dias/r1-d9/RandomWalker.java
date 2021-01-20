public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int distance = 0;
        int steps = 0;

        while (distance != r) {
            System.out.println("(" + x + ", " + y + ")");

            double random = Math.random();
            if (random <= 0.25) x++;
            else if (random <= 0.5) x--;
            else if (random <= 0.75) y++;
            else y--;

            steps++;
            distance = (Math.abs(x)) + (Math.abs(y));

        }
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + steps);

    }
}
