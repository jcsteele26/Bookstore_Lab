import java.io.IOException;
import java.util.ArrayList;
public class BookStore {

    private String name;
    private String address;
    private int squareFeet;
    public String usedBooks;
    public String isOpen;
    public String openWeekend;
    public String openSunday;
    public String openTime;
    public String closingTime;
    private int total = 0;
    private int count = 0;

    public BookStore(){
        this.name = "Ed Bookstore";
        this.address = "123 Book Lane";
        this.squareFeet = 2500;
        this.usedBooks = "new and used books";
        this.isOpen = "Mon - Fri 9am - 6pm";
        this.openWeekend = "Sat 9am - 4pm";
        this.openSunday = "closed";
        this.openTime = "9am";
        this.closingTime = "Mon - Fri 6pm  Sat 4pm";

        // init the array and then load it.
        titles = new ArrayList<String>();
        loadTitles();
        
    }
    public void getTitles(){   // print titles method
        System.out.print(titles);
    }

    public void searchTitle(String book){   // search for title method
        for(String item : titles){
            if (item.contains(book)){
                count = count + 1;
            } 
        }
        System.out.println("We have " + count + " titles matching that name.");
    }

    public void bookTotal(){  // method to count the number of books
        total = titles.size();
        System.out.print(total);
    }

    public void getName(){   // method to get store name
        System.out.println(name);
    }
    
    public void getAddress(){   // method to get store address
        System.out.println(address); 
    }
    
    public void getSquareFeet(){   // method to get store size
        System.out.println(squareFeet + " square feet");;
    }

    public void getUsedBooks(){  // method to check for used books
        System.out.println(usedBooks);
    }

    public void getIsOpen(){   // method to display store hours
        System.out.println(isOpen);
    }

    public void getOpenWeekend(){  // method to check weekend hours
        System.out.println(openWeekend);
    }

    public void getOpenSunday(){  // method to check Sunday hours
        System.out.println(openSunday);
    }

    public void getOpenTime(){   // method to get opening time
        System.out.println(openTime);
    }

    public void getClosingTime(){   // method to get closing time
        System.out.println(closingTime);
    }

    private ArrayList<String> titles;  // create book title array list

    private void loadTitles() {
            try
        {
            Utils.loadStringsToArray(this.titles);
        }
            catch (IOException e)
        {
    // for now simply init the array to zero
            System.out.println("Could not initialize the titles");
    // make sure it is empty
            this.titles = new ArrayList<String>();
    
        }
    }
    
}