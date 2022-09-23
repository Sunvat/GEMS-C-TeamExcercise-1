public class division{

    public double divide(String equation) throws Exception {
        String numbers[] = equation.split("/", 2);
        double answer;

        if (numbers[1].trim().equals("0")){
            System.out.println("Can not divide by zero.\nPlease try agian.");
            throw new Exception("Can not divide by zero.");
        }

        double numerator = Double.parseDouble(numbers[0].trim());
        double denominator = Double.parseDouble(numbers[1].trim());
        answer = numerator/denominator;
        
        return answer;
    }
}