public class multiply{

    public double multiply(String equation) {
        String num[] = equation.split("*", 2); //added input
        double ans;
        double a = Double.parseDouble(num[0].trim()); // getting the first number
        double b= Double.parseDouble(num[1].trim());// getting the second number
        ans = a*b; //multiply 2 numbers and get the answer
        return ans;
    }
}