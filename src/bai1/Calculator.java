package bai1;

public class Calculator {
    public int number1;
    public int number2;

    public Calculator() {

    }

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //sum
    public int getSum() {
        return number1 + number2;
    }

    public int getSum(int number1, int number2) {
        return number1 + number2;
    }

    //diff
    public int getDiff() {
        return number1 - number2;
    }

    public int getDiff(int number1, int number2) {
        return number1 - number2;
    }

    //product
    public int getProduct() {
        return number1 * number2;
    }

    public int getProduct(int number1, int number2) {
        return number1 * number2;
    }

    //quotient
    public double getQuotient() {
        return (double) number1 / number2;
    }

    public double getQuotient(int number1, int number2) {
        return (double) number1 / number2;
    }

    public void output() {
        System.out.println("Sum: " + getSum());
        System.out.println("Diff " + getDiff());
        System.out.println("Product " + getProduct());
        System.out.println("Quotient " + getQuotient());
    }

    public void output(int number1, int number2) {
        System.out.println("Sum: " + getSum(number1, number2));
        System.out.println("Diff " + getDiff(number1, number2));
        System.out.println("Product " + getProduct(number1, number2));
        System.out.println("Quotient " + getQuotient(number1, number2));
    }

}
