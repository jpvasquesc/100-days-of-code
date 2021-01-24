public class E32 {
    public static void main(String[] args) {
        double n = Integer.parseInt(args[0]);
        double N = Math.round(Math.pow(n, 1.0 / 3.0));
        double lastone = 0.0;
        for (double a = 1; a <= n; a++) {
            for (double b = 1; b <= N; b++) {
                for (double c = 1; c <= N; c++) {
                    for (double d = 1; d <= N; d++) {
                        if ((a != c) && (a != d) && (a != b) && (b != c) && (b != d) && (c != d)) {
                            double s1 = (Math.pow(a, 3) + Math.pow(b, 3));
                            double s2 = (Math.pow(c, 3) + Math.pow(d, 3));
                            if (s1 <= n) {
                                if (s1 == s2) {
                                    if (s1 != lastone) {
                                        lastone = s1;
                                        System.out.println(s1 + " = " + a + " + " + b + " = " + c + " + " + d);
                                    }
                                }
                            } else {
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }
    }
}
