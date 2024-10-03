public class TernaryOperatorExplanation {
    public static void main(String[] args) {
        int number = 5;

        // Using an if-else statement
        String resultIfElse;
        if (number % 2 == 0) {
            resultIfElse = "Even";
        } else {
            resultIfElse = "Odd";
        }
        System.out.println("Result using if-else: " + resultIfElse);

        // Using a ternary operator
        String resultTernary = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Result using ternary operator: " + resultTernary);
    }
}