package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(7);
    numbers.add(3);
    numbers.add(2);

    System.out.println(numbers);

    Collections.sort(numbers);
    System.out.println(numbers);
  }
}
