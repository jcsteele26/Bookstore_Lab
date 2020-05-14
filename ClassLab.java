import java.util.Scanner;
public class ClassLab{

    public static void main(String[] args) {

        BookStore b = new BookStore();
        System.out.print("Welcome to  " );
        b.getName();
        System.out.println();
        System.out.print("What is the address?  ");
        b.getAddress();
        System.out.println("");
        System.out.print("Is the store open today?  ");
        b.getIsOpen();
        System.out.println("");
        System.out.print("What time does it close?  ");
        b.getClosingTime();
        System.out.println("");
        System.out.print("How big is this store?  ");
        b.getSquareFeet();
        System.out.println("");
        System.out.print("Does the store have used books?  ");
        b.getUsedBooks();
        System.out.println("");

        System.out.print("How many books do you have in stock?  ");
        b.bookTotal();
        System.out.println("");

        System.out.print("Do you have Harry Potter?  ");
        b.searchTitle("Harry Potter");
        System.out.println("");

        System.out.println("What titles do you have? ");
        b.getTitles();
        System.out.println("");
    }
}