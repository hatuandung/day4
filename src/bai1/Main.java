package bai1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(50, 25);
        Calculator calculator12 = new Calculator();

        calculator1.output();
        System.out.println("#################");
        calculator12.output(45,100);

    }
}
