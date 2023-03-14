public class Student extends LibraryManagementSystem{
  static  int studcount;
    static int borrowcounter = 0;
    public Student( ) {
        super();
    }

    public Student(String name, String idNumber) {
                super(name,idNumber);
                studcount++;
    }

    static void borrowBook(Book books[], String serialNumber) {
        for (int i = 0; i < Book.bookCount; i++) {
            if (books[i].getSerialNumber().equals(serialNumber) && books[i].availability) {
                System.out.println("Book borrowed successfully.");
                books[i].availability = false;
                borrowcounter++;
                return;
            }
        }
        System.out.println("Book not found or already borrowed.");
    }

    static void returnBook(Book books[], String serialNumber) {
        for (int i = 0; i < Book.bookCount; i++) {
            if (books[i].getSerialNumber().equals(serialNumber) && !books[i].availability) {
                System.out.println("Book returned successfully.");
                books[i].availability = true;
                return;
            }
        }
        System.out.println("Book not found or already returned.");
    }
}
