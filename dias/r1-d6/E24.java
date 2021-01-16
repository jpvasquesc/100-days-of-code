public class E24 {
    //Loan payments. Write a program that calculates the monthly payments
    //you would have to make over a given number of years to pay off a loan at a given
    //interest rate compounded continuously,taking the number of years "t",the principal
    //"P", and the annual interest rate "r" as command-line arguments. The desired value is
    //given by the formula Pe^rt. Use Math. exp().

    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double p = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double result = p * Math.exp(r * t);
        System.out.println(result);

    }
}
