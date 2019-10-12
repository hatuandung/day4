package bai1;

public class Calculator {
    public int number1 ;
    public int number2 ;

    public Calculator(){

    }
    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    //sum
    public int sum(){
        return number1 + number2;
    }

    public int sum(int number1, int number2){
        return number1 + number2;
    }
    //diff
    public int diff(){
        return number1 - number2;
    }
    public int diff(int number1, int number2){
        return number1 - number2;
    }
    //product
    public int product(){
        return number1 * number2;
    }
    public int product(int number1, int number2){
        return number1 * number2;
    }
    //quotient
    public double quotient(){
        return (double) number1 / number2;
    }
    public double quotient(int number1, int number2){
        return (double) number1 / number2;
    }

    public void output(){
        System.out.println("Sum: " + sum());
        System.out.println("Diff " + diff());
        System.out.println("Product " + product());
        System.out.println("Quotient " + quotient());
    }

    public void output(int number1, int number2){
        System.out.println("Sum: " + sum(number1, number2));
        System.out.println("Diff " + diff(number1, number2));
        System.out.println("Product " + product(number1, number2));
        System.out.println("Quotient " + quotient(number1, number2));
    }

}
