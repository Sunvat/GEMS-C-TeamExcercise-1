public class multiply{

    public double multiply(String equation) {
        String numbers[] = equation.split("*", 2); //added input
        double ans;
        double a = Double.parseDouble(numbers[0].trim()); // getting the first number
        double b= Double.parseDouble(numbers[1].trim());// getting the second number
        ans = a*b; //multiply 2 numbers and get the answer
        return ans;
    }
}