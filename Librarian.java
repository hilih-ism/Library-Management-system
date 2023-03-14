
import java.util.Scanner;

public class Librarian extends LibraryManagementSystem {
    Scanner SC = new Scanner(System.in);

    public Librarian(String name, String id) {
        super(name, id);
    }

    Librarian() {
    }

    public void display(LibraryManagementSystem books[]) {
        int i;
        if (Student.borrowcounter == Book.bookCount && Book.bookCount == 0)
            System.out.println("There is no book avaliable.");
        for (i = 0; i < Book.bookCount; i++) {
            if (((Book) books[i]).availability == true && (books[i] instanceof Book)) {
                System.out.println("The full information of book: " + (i + 1));
                System.out.println("*****************************************************");
                System.out.println("* Serial Number: " + ((Book) books[i]).getSerialNumber());
                System.out.println("* Book Name: " + ((Book) books[i]).getBookName());
                System.out.println("* Book Author: " + ((Book) books[i]).author);
                System.out.println("* Publisher: " + ((Book) books[i]).getPublisher());
                System.out.println("* Year of Edition: " + ((Book) books[i]).getYear());
                System.out.println("*****************************************************");
            }
        }
        for (i = 0; i < Student.studcount; i++) {

            if (books[i] instanceof Student) {
                System.out.println("****************************");
                System.out.println("name" + ((Student) books[i]).Name);

                System.out.println("****************************");
            }
        }
    }

    void deleteBookBySR(Book books[], String sNo) {
        for (int i = 0; i < Book.bookCount; i++) {
            if (books[i].getSerialNumber().equals(sNo) && books[i].availability == true) {
                books[i] = null;

                System.out.println("Book deleted successfully.");
            }
        }
        for (int i = 0; i < Book.bookCount; i++) {
            if(books[i] == null){
                for (int j = i; j < Book.bookCount; j++) {
                books[j] =books[j+1];

            }
            Book.bookCount--;
        }

    }

}

    void deleteBookByName(Book books[], String name) {
        for (int i = 0; i < Book.bookCount; i++) {
            if (books[i].getBookName().equals(name) && books[i].availability == true) {
                books[i] = null;
                System.out.println("Book deleted successfully.");
            }
        }
        for (int i = 0; i < Book.bookCount; i++) {
            if(books[i] == null){
                for (int j = i; j < Book.bookCount; j++) {
                books[j] =books[j+1];

            }
            Book.bookCount--;
        }

    }
    }

    static void displayBooks(LibraryManagementSystem books[]) {
        for (int i = 0; i < Book.bookCount; i++) {
            System.out.println("serialNumber: " + ((Book) books[i]).getSerialNumber() +
                    ", Book Name: " + ((Book) books[i]).getBookName() +
                    ", Author: " + ((Book) books[i]).author +
                    ", Availability: " + ((Book) books[i]).availability);
        }
    }

}
