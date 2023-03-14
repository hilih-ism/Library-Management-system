import java.util.Scanner;

public class Book extends LibraryManagementSystem implements BookCatalog {
    protected String author;
    private String publisher;
    private int year;
    private String serialNumber;
    public boolean availability = true;
    static int bookCount = 0;
    Scanner SC = new Scanner(System.in);

    public Book(String serialNumber, String bookName, String author, String publisher, int year) {
        super(bookName, serialNumber);
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        bookCount++;
    }

    public String getSerialNumber() {
        return ID;
    }

    public void setSerialNumber(String serialNumber) {
        this.ID = serialNumber;
    }

    public String getBookName() {
        return Name;
    }

    public void setBookName(String bookName) {
        this.Name = bookName;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public void searchByBookName(Book books[]) {
        System.out.println("Enter the name of the book for searching.");
        String bookname = SC.next();
        int i,findb=-1;
        for ( i = 0; i < Book.bookCount; i++) {
            if (books[i].getBookName().equalsIgnoreCase(bookname) && books[i].availability == true) {
               findb++;
                break;
          }
          
          }
          if(findb>=0)
          {
            System.out.println("The full information of book: " );
            System.out.println("*****************************************************");
            System.out.println("* Serial Number: " + ((Book) books[i]).getSerialNumber());
            System.out.println("* Book Name: " + ((Book) books[i]).getBookName());
            System.out.println("* Book Author: " + ((Book) books[i]).author);
            System.out.println("* Publisher: " + ((Book) books[i]).getPublisher());
            System.out.println("* Year of Edition: " + ((Book) books[i]).getYear());
            System.out.println("*****************************************************");
        }          else
          System.out.println("-------------Book Not Found-------------");
    }
@Override
    public void searchBySerialNumber(Book books[]) {
        System.out.println("Enter the serial number of the book for searching.");
        String srNumber = SC.next();
        int i,find=-1;
        for (i = 0; i < Book.bookCount; i++) {
            if (books[i].getSerialNumber().equalsIgnoreCase(srNumber) && books[i].availability == true) {
                find++;
                break;
            }
        }
            if(find>=0){
                System.out.println("The full information of  book: " );
                System.out.println("*****************************************************");
                System.out.println("* Serial Number: " + ((Book) books[i]).getSerialNumber());
                System.out.println("* Book Name: " + ((Book) books[i]).getBookName());
                System.out.println("* Book Author: " + ((Book) books[i]).author);
                System.out.println("* Publisher: " + ((Book) books[i]).getPublisher());
                System.out.println("* Year of Edition: " + ((Book) books[i]).getYear());
                System.out.println("*****************************************************");
            }
                else
                System.out.println("-------------Book Not Found-------------");


        }
       
}
