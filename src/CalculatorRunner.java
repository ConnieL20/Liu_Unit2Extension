import java.util.Scanner;


public class CalculatorRunner {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        int signIndex = expression.indexOf(" ");
        String sign = expression.substring(signIndex + 1, signIndex + 2);
        int signIndex2 = expression.indexOf(sign);

        //parsing
        double firstValue = Double.parseDouble(expression.substring(0, signIndex));
        double secondValue = Double.parseDouble(expression.substring(signIndex2 + 1));

        //object
        Calculator calc = new Calculator(firstValue, secondValue);

        //implementation



    }
}
