package Classes.Book;

public class Book {
  private String title;
  private int numberOfPages;
  private String isbn;

  Book(String title, int numberOfPages, String isbn) {
    this.title = title;
    this.numberOfPages = numberOfPages;
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
