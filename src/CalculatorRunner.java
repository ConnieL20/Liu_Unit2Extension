import java.util.Scanner;


public class CalculatorRunner {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int again = 0;
        System.out.println("Welcome!");

        while (again >= 0) {
            System.out.print("Enter an expression with *, /, +, -, %, or ^ (type in '-1' to stop): ");
            String expression = scan.nextLine();
            if (expression.equals("-1")) {
                break;
            }

            int signIndex = expression.indexOf(" ");
            String sign = expression.substring(signIndex + 1, signIndex + 2);
            int signIndex2 = expression.indexOf(sign);

            //parsing
            double firstValue = Double.parseDouble(expression.substring(0, signIndex));
            double secondValue = Double.parseDouble(expression.substring(signIndex2 + 1));

            //object
            Calculator calc = new Calculator(firstValue, secondValue);

            //conditionals to check what operation is being applied to the expression the user inputted.
            if (sign.equals("+")) {
                System.out.println(calc.addition());
            } else if (sign.equals("-")) {
                System.out.println(calc.subtraction());
            } else if (sign.equals("*")) {
                System.out.println(calc.multiplication());
            } else if (sign.equals("/")) {
                System.out.println(calc.division());
            } else if (sign.equals("^")){
                System.out.println(calc.exponent());
            } else if (sign.equals("%")) {
                System.out.println(calc.mod());
            } else {
                System.out.println("The expression you have inputted cannot be calculated in this program!");
            }
        }


    }
}
