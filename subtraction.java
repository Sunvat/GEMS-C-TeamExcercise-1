public class subtraction {
    public double subtract(String equation) throws Exception {
        String numbers[] = equation.split("-", 2); // Split the string being input into two parts, limit to only two splits.
        double answer; //initilize answer

        double FirstNum = Double.parseDouble(numbers[0].trim()); // Parse the numbers from the String
        double SecondNum = Double.parseDouble(numbers[1].trim());

        answer = FirstNum-SecondNum; // Find the answer by subtracting SecondNum from FirstNum
        return answer; //return final value
        
    } 
}
