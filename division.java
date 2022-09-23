public class division{

    public double divide(String equation) throws Exception {
        String numbers[] = equation.split("/", 2); // Split the string being input
        double answer;

        if (numbers[1].trim().equals("0")){ // Catch if the user is trying to divide by zero
            System.out.println("Can not divide by zero.\nPlease try agian.");
            throw new Exception("Can not divide by zero.");
        }

        double numerator = Double.parseDouble(numbers[0].trim()); // Parse the numbers from the String
        double denominator = Double.parseDouble(numbers[1].trim());
        answer = numerator/denominator; // Find the answer
        
        return answer;
    }
}