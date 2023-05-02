package Classes.Book;

public class Book {
  String title;
  int numberOfPages;
  String isbn;

  public Book(String title, int numberOfPages, String isbn) {
    this.title = title;
    this.numberOfPages = numberOfPages;
    this.isbn = isbn;
  }

  public int returnNumberOfPages() {
    return numberOfPages;
  }


}
