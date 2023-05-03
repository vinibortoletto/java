package calculator;

public class Main {

  public static void main(String[] args) {
    Calculator calculator = new Calculator(10, 10);
    int sum = calculator.sum();
    System.out.println(sum);

  }

}
