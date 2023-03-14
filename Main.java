import java.util.Scanner;
/*
    Members name                                          IDNO

1.	Aledya Tekalgn ------------------------------------  1307786
2.	Esubalew Sintie------------------------------------  1307570
3.	Fekadu Sisay---------------------------------------  1306120
4.	Feven Tesfaye--------------------------------------  1307726
5.	Hildana Shisema -----------------------------------  1307582
6.	Nigist Genene -------------------------------------  1307538
7.	Nigist Woldemichael -------------------------------  1308041

*/
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Book[] books = new Book[10];
        Librarian librarian = new Librarian();
        Student stud[] = new Student[10];
        while (true) {
            System.out.println("  ____________________________________________");
            System.out.println("||                                            ||");
            System.out.println("||                                            ||");
            System.out.println("||      press 1 for Librarian access.         ||");
            System.out.println("||      Press 2 for student access.           ||");
            System.out.println("||      Press 0 to exit.                      ||");
            System.out.println("||                                            ||");
            System.out.println("||____________________________________________||");
            boolean continueInput = true;
            int choice = 0;

do {
try
{
System.out.print ("                   >> "); 
choice = sc.nextInt();
continueInput = false;
}
catch(Exception e) {
    System.out.println("Try again, Incorrect input"); 
sc.nextLine(); 
}
} while (continueInput);


            switch (choice) {
                case 1: {
                    boolean r = true;
                    int q = 1;
                    if (q == 1) {
                        System.out.println("*****Login page*****");
                        System.out.println("Enter your name.");
                        String str = sc.next();
                        System.out.println("Enter your Id.");
                        String str1 = sc.next();

                        q++;
                        librarian = new Librarian(str, str1);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("You loged sucessfully!!!");
                    }
                    while (r) {

                        System.out.println("  __________________________________________________");
                        System.out.println("||                                                  ||");
                        System.out.println("||                                                  ||");
                        System.out.println("||      Press 1 to add book.                        ||");
                        System.out.println("||      press 2 to show available books.            ||");
                        System.out.println("||      Press 3 to Search book.                     ||");
                        System.out.println("||      Press 4 to delete book.                     ||");
                        System.out.println("||      Press 5 to log out from librarian account.  ||");
                        System.out.println("||      Press 0 to Exit.                            ||");
                        System.out.println("||                                                  ||");
                        System.out.println("||                                                  ||");
                        System.out.println("||__________________________________________________||");
                        boolean N=true;
                        int choice1=0;
                        do{
                            try{
                                System.out.print ("                   >> "); 
                                choice1 = sc.nextInt();
                             N=false;
                            }
                            catch(Exception e){
                            System.out.println("You entered wrong number");
                            sc.nextLine();                            }
                        }
                             while(N);         
                             switch (choice1) {
                            case 1: {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                int m;
                                System.out.println("Enter the number of books you need to insert.");
                                m = sc.nextInt();
                                int NumberOfObject =m+Book.bookCount;
                                for (int i = Book.bookCount; i < NumberOfObject; i++) {

                                    System.out.println("Enter serial number");
                                    String serial = sc.next();
                                    System.out.println("Enter book name");
                                    String bookName = sc.next();
                                    System.out.println("Enter author");
                                    String author = sc.next();
                                    System.out.println("Enter publisher");
                                    String publisher = sc.next();
                                    boolean F=true;
                                    int year=0;
                                    do{
                                        try{
                                            System.out.println("Enter publication year");
                                            year = sc.nextInt();
                                            F=false;
                                        }
                                        catch(Exception e){
                                            System.out.println("You entered wrong number");
                                            sc.nextLine();                            }
                                        }
                                             while(F);                                    
                                    books[i] = new Book(serial, bookName, author, publisher, year);

                                }
                                break;
                            }
                            case 2: {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                librarian.display(books);
                                break;
                            }

                            case 3: {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                boolean p = true;
                                while (p) {
                                    System.out.println("  _____________________________________________________");
                                    System.out.println("||                                                     ||");
                                    System.out.println("||                                                     ||");
                                    System.out.println("||       Press 1 to search book by name.               ||");
                                    System.out.println("||       Press 2 to search book by serial number.      ||");
                                    System.out.println("||       Press 3 to return back.                       ||");
                                    System.out.println("||                                                     ||");
                                    System.out.println("||                                                     ||");
                                    System.out.println("||_____________________________________________________||");
                                    boolean L=true;
                                    int J=0;
                                    do{
                                        try{
                                         System.out.print ("                   >> "); 
                                        J = sc.nextInt();
                                         L=false;
                                        }
                                        catch(Exception e){
                                        System.out.println("You entered wrong number");
                                        sc.nextLine();                            }
                                    }
                                         while(L);       
                             switch (J) {
                                        case 1: {
                                            System.out.print("\033[H\033[2J");
                                            System.out.flush();
                                            books[0].searchByBookName(books);
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\033[H\033[2J");
                                            System.out.flush();
                                            books[0].searchBySerialNumber(books);
                                            break;
                                        }
                                        case 3: {
                                            p = false;
                                            break;
                                        }
                                        default:
                                            System.out.println("Wrong entry,try again");
                                            break;
                                    }
                                }
                            }
                                break;
                            case 4: {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                boolean t = true;
                                while (t) {
                                    System.out.println("  _____________________________________________________");
                                    System.out.println("||                                                     ||");
                                    System.out.println("||                                                     ||");
                                    System.out.println("||     Press 1 to delete book by serial number.        ||");
                                    System.out.println("||     Press 2 to delete book by name.                 ||");
                                    System.out.println("||     Press 3 to return back.                         ||");
                                    System.out.println("||     Press 0 to exit.                                ||");
                                    System.out.println("||                                                     ||");
                                    System.out.println("||                                                     ||");
                                    System.out.println("||_____________________________________________________||");
                                    boolean M=true;
                                    int c=0;
                                    do{
                                        try{
                                            System.out.print ("                   >> "); 
                                        c= sc.nextInt();
                                        M=false;
                                        }
                                        catch(Exception e){
                                        System.out.println("You entered wrong number");
                                        sc.nextLine();                            }
                                    }
                                         while(M);
                                          switch (c) {
                                        case 1: {
                                            System.out.print("\033[H\033[2J");
                                            System.out.flush();
                                            System.out.println("Enter book serial number to delete.");
                                            String serialnumber1 = sc.next();
                                            librarian.deleteBookBySR(books, serialnumber1);
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("\033[H\033[2J");
                                            System.out.flush();
                                            System.out.println("Enter the name of the book to be deleted.");
                                            String name = sc.next();
                                            librarian.deleteBookByName(books, name);
                                            break;
                                        }
                                        case 3: {
                                            t = false;
                                            break;
                                        }
                                        case 0: {
                                            System.out.println("Exiting the system.");
                                            System.exit(0);
                                            break;
                                        }
                                        default:
                                            System.out.println("Wrong entry,try again");
                                            break;
                                    }
                                }

                            }
                                break;
                            case 5: {
                                r = false;
                                break;
                            }
                            default:
                                System.out.println("Wrong entry,try again");
                                break;
                        }
                    }
                }
                    break;
                case 2: {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    boolean z = true;
                    int v = 1;
                    if (v == 1) {
                        System.out.println(" login.");
                        System.out.println("Enter your name.");
                        String str = sc.next();
                        System.out.println("Enter your Id.");
                        String str1 = sc.next();
                        System.out.println("You loged sucessfully!!!");
                        v++;
                        stud[0] = new Student(str, str1);

                    }
                    while (z) {
                    
                        System.out.println("  _____________________________________________________");
                        System.out.println("||                                                     ||");
                        System.out.println("||                                                     ||");
                        System.out.println("||     Press 1 to borrow book.                         ||");
                        System.out.println("||     Press 2 to return book.                         ||");
                        System.out.println("||     Press 3 to show avaliable books.                ||");
                        System.out.println("||     Press 4 to log out from student account.        ||");
                        System.out.println("||     Press 0 to exit.                                ||");
                        System.out.println("||                                                     ||");
                        System.out.println("||                                                     ||");
                        System.out.println("||_____________________________________________________||");
                        boolean x=true;
                        int J=0;
                        do{
                            try{
                                System.out.print ("                   >> "); 

                            J = sc.nextInt();
                             x=false;
                            }
                            catch(Exception e){
                            System.out.println("You entered wrong number");
                            sc.nextLine();                            }
                        }
                             while(x);
                        switch (J) {
                            case 1: {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.print("Enter book ID to borrow: ");
                                String serialnumber = sc.next();
                                Student.borrowBook(books, serialnumber);
                                break;
                            }
                            case 2: {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.print("Enter book ID to return: ");
                                String serialnumber = sc.next();
                                Student.returnBook(books, serialnumber);
                                break;
                            }
                            case 3: {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                librarian.display(books);
                                break;
                            }
                            case 4: {
                                z = false;
                                break;
                            }
                            case 0: {
                                System.out.println("Exiting the system.");
                                System.exit(0);
                                break;
                            }
                            default:
                                System.out.println("Invalid choice, try again.");
                        }
                    }
                }
                    break;
                case 0: {
                    System.out.println("Exiting the system.");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
