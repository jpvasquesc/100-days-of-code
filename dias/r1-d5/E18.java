public class E18 {
    public static void main(String[] args) {
        //Take coordinates from command line
        double x1 = Integer.parseInt(args[0]);
        double y1 = Integer.parseInt(args[1]);
        double x2 = Integer.parseInt(args[2]);
        double y2 = Integer.parseInt(args[3]);

        //Do the calculation
        double fim = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println(fim);

    }
}
