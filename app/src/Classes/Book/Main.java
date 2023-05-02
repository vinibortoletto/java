package Classes.Book;

public class Main {
  public static void main(String[] args) {
    Book book = new Book("Dune", 702, "123BR");
    int numberOfPages = book.returnNumberOfPages();
    System.out.println(numberOfPages);
  } 
}
