public class Calculator {

    //instance variables
    private final double firstValue;
    private final double secondValue;

    //calculator constructor
    public Calculator(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    //addition
    public double addition(){
        return firstValue + secondValue;
    }

    //subtraction
    public double subtraction() {
        return firstValue - secondValue;
    }

    //multiplication
    public double multiplication() {
        return firstValue * secondValue;
    }

    //division
    public double division() {
        return firstValue / secondValue;
    }

    //exponent
    public double exponent() {
        return Math.pow(firstValue, secondValue);
    }

    //mod
    public double mod() {
        return firstValue % secondValue;
    }
}
