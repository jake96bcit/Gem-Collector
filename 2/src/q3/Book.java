package q3;

/**
 * Book.
 *
 * @author Vinh Le
 * @version 1.0
 */
public class Book {
    
    /**
     * Declare title.
     */
    private String title;
    
    /**
     * Declare author.
     */
    private String author;
    
    /**
     * Declare publisher.
     */
    private String publisher;
    
    /**
     * Declare copyrightDate.
     */
    private int copyrightDate;
    
    /**
     * Create a book elements.
     * @param bookTitle
     *  Title of the book.
     * @param authorName
     *  Name of the book author.
     * @param publisherName
     *  Name of the book publisher.
     * @param date
     *  When were the book published.
     */
    public Book(String bookTitle, String authorName,
                    String publisherName, int date) {
        title = bookTitle;
        author = authorName;
        publisher = publisherName;
        copyrightDate = date;
    }
    
    /**
     * Set a value for author.
     * @param authorName
     * Name of the author.
     */
    public void setAuthor(String authorName) {
        author = authorName;
    }
    
    /**
     * Get the author name.
     * @return
     *  Author name.
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Set a value for title.
     * @param bookTitle
     *  Title of the book.
     */
    public void setTitle(String bookTitle) {
        title = bookTitle;
    }
    
    /**
     * Get the book title.
     * @return
     *  Book title.
     */
    public String getTitle() {
        return title;
    }
     /**
      * Set a value for publisher.
      * @param publisherName
      *  Name of the publisher.
      */
    public void setPublisher(String publisherName) {
        publisher = publisherName;
    }
    
    /**
     * Get the publisher name.
     * @return
     *  Publisher name.
     */
    public String getPublisher() {
        return publisher;
    }
    
    /**
     * Set a value for date.
     * @param date
     *  Publish day.
     */
    public void setCopyRightDate(int date) {
        copyrightDate = date;
    }
    
    /**
     * Get the publish day.
     * @return
     *  Publish day of the book.
     */
    public int getCopyRightDate() {
        return copyrightDate;
    }
    
    /**
     * Get the books information.
     * @return
     *  the book information.
     */
    public String toString() {
        return (title + "\t" + author + "\t" 
                + publisher + "\t" + copyrightDate);
    }
}
