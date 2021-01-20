public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int distance = 0;
            int steps = 0;

            while (distance != r) {
                double random = Math.random();
                if (random <= 0.25) x++;
                else if (random <= 0.5) x--;
                else if (random <= 0.75) y++;
                else y--;

                steps++;
                distance = (Math.abs(x)) + (Math.abs(y));
            }

            totalSteps += steps;
        }
        System.out.println("average number of steps = " + ((double) totalSteps / (double) trials));
    }
}
