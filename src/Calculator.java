public class Calculator {

    //instance variables
    private double firstValue;
    private double secondValue;

    //calculator constructor
    public Calculator(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    //addition
    public double addition(){
        double sum = firstValue + secondValue;
        return sum;
    }

    //subtraction
    public double subtraction() {
        double difference = firstValue - secondValue;
        return difference;
    }

    //multiplication
    public double multiplication() {
        double product = firstValue * secondValue;
        return product;
    }
}
