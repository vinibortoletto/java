package calculator;

public class Calculator {
  private int firstNumber;
  private int secondNumber;

  Calculator(int firstNumber, int secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
  }

  public void setFirstNumber(int firstNumber) {
    this.firstNumber = firstNumber;
  }

  public void setSecondNumber(int secondNumber) {
    this.secondNumber = secondNumber;
  }

  public int sum() {
    return firstNumber + secondNumber;
  }
}
