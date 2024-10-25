package Lib;

public class BookDTO {
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private int price;

    public BookDTO(String isbn, String title, String author, String publisher, int price) {
        this.isbn = isbn;
        this.bookName = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // Getter and Setter methods
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return bookName;
    }

    public void setTitle(String title) {
        this.bookName = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", 도서명: " + bookName + ", 저자명: " + author +
                ", 출판사: " + publisher + ", 가격: " + price + "원\n";
    }
}