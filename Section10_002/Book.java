package Section10_002;

public class Book {
    private String bookName;
    private String authorName;
    private int publicYear;

    //contruction
    public Book(String bookName, String authorName, int publicYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicYear = publicYear;
    }
    public Book(){

    }

    public Book(String authorName, int publicYear) {
        this.authorName = authorName;
        this.publicYear = publicYear;
    }

    //setter getter
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getPublicYear() {
        return publicYear;
    }
    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    //toString

    @Override
    public String toString() {
        return "Book{" +
                "BookName : " + bookName + '\'' +
                "AuthorName : " + authorName + '\'' +
                "PublicYear : " + publicYear +
                '}';
    }
}
