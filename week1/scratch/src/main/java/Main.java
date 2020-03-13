
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        assert calculator.add(1, 2) == 3      : "Add method is incorrect";
        assert calculator.subtract(3, 2) == 1 : "Subtract method is incorrect";
        assert calculator.multiply(1, 2) == 2 : "Multiply method is incorrect";
        assert calculator.divide(2, 1) == 2   : "Divide method is incorrect";

        System.out.println("Complete!");
    }
}