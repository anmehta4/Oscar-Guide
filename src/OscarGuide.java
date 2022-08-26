// --== CS400 File Header Information ==--
// Name: Arnav and Ishita
// Email: anmehta4@wisc.edu
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

import java.util.Scanner;

/**
 * This class runs the Oscar Guide application and lets users look up the best movie for each year
 * as awarded by the Academy Awards
 * 
 * @author hazaa
 *
 */
public class OscarGuide implements MovieList {

  public static RedBlackTree<Movies> tree = new RedBlackTree<Movies>();
  public static Scanner sc = new Scanner(System.in);

  private final static String WELCOME_MESSAGE =
      "==================== Welcome to the Oscar Guide ===================";
  private final static String GOODBYE_MESSAGE =
      "=============== Thank You for using the Oscar Guide ===============";

  public static Movies lookup(int year) {
    Movies findRecord = new Movies("", "", "", year);
    return lookupHelper(findRecord, tree.root);
  }

  public static Movies lookupHelper(Movies findRecord, RedBlackTree.Node<Movies> current) {
    if (current.data == null) {
      return null;
    }
    if (current.data.compareTo(findRecord) == 0) { // checking if the node is equal to the
                                                   // findRecord
      return current.data;
    } else if (findRecord.compareTo(current.data) > 0) { // determining which tree to
      // follow
      return lookupHelper(findRecord, current.rightChild); // if newRecord is older then
      // right subtree
    } else if (findRecord.compareTo(current.data) < 0) { // else the left subtree
      return lookupHelper(findRecord, current.leftChild);
    }
    return null;
  }

  public static void main(String[] args) {
    insertAllMovies();
    System.out.println("\n" + WELCOME_MESSAGE + "\n"); // Displaying the welcome message
    runOscarGuide(); // run the app based on user input
    System.out.println(GOODBYE_MESSAGE); // display the goodbye message
  }

  public static void insertAllMovies() {
    tree.insert(For1928);
    tree.insert(For1929);
    tree.insert(For1930);
    tree.insert(For1931);
    tree.insert(For1932);
    tree.insert(For1934);
    tree.insert(For1935);
    tree.insert(For1936);
    tree.insert(For1937);
    tree.insert(For1938);
    tree.insert(For1939);
    tree.insert(For1940);
    tree.insert(For1941);
    tree.insert(For1942);
    tree.insert(For1943);
    tree.insert(For1944);
    tree.insert(For1945);
    tree.insert(For1946);
    tree.insert(For1947);
    tree.insert(For1948);
    tree.insert(For1949);
    tree.insert(For1950);
    tree.insert(For1951);
    tree.insert(For1952);
    tree.insert(For1953);
    tree.insert(For1954);
    tree.insert(For1955);
    tree.insert(For1956);
    tree.insert(For1957);
    tree.insert(For1958);
    tree.insert(For1959);
    tree.insert(For1960);
    tree.insert(For1961);
    tree.insert(For1962);
    tree.insert(For1963);
    tree.insert(For1964);
    tree.insert(For1965);
    tree.insert(For1966);
    tree.insert(For1967);
    tree.insert(For1968);
    tree.insert(For1969);
    tree.insert(For1970);
    tree.insert(For1971);
    tree.insert(For1972);
    tree.insert(For1973);
    tree.insert(For1974);
    tree.insert(For1975);
    tree.insert(For1976);
    tree.insert(For1977);
    tree.insert(For1978);
    tree.insert(For1979);
    tree.insert(For1980);
    tree.insert(For1981);
    tree.insert(For1982);
    tree.insert(For1983);
    tree.insert(For1984);
    tree.insert(For1985);
    tree.insert(For1986);
    tree.insert(For1987);
    tree.insert(For1988);
    tree.insert(For1989);
    tree.insert(For1990);
    tree.insert(For1991);
    tree.insert(For1992);
    tree.insert(For1993);
    tree.insert(For1994);
    tree.insert(For1995);
    tree.insert(For1996);
    tree.insert(For1997);
    tree.insert(For1998);
    tree.insert(For1999);
    tree.insert(For2000);
    tree.insert(For2001);
    tree.insert(For2002);
    tree.insert(For2003);
    tree.insert(For2004);
    tree.insert(For2005);
    tree.insert(For2006);
    tree.insert(For2007);
    tree.insert(For2008);
    tree.insert(For2009);
    tree.insert(For2010);
    tree.insert(For2011);
    tree.insert(For2012);
    tree.insert(For2013);
    tree.insert(For2014);
    tree.insert(For2015);
    tree.insert(For2016);
    tree.insert(For2017);
    tree.insert(For2018);
    tree.insert(For2019);
    tree.insert(For2020);

  }

  /**
   * Runs the Oscar Guide app based on user inputs and runs till the user quits the application
   */
  public static void runOscarGuide() {

    int option = chooseOption(); // asking the user to enter an option
    while (option != 2) {

      if (option == 1) {
        System.out.println("Please enter an year between 1928 to 2020");
        // Asking the user to enter an year to find the Best Picture of that year
        int year = sc.nextInt();
        if (year == 1933) { // Special case: Academy awards didn't happen in 1933
          System.out.println("The 1934 Academy Awards ceremony was the last time the event "
              + "recognized movies spread over two calendar years (which is why there is no "
              + "1933 movie listed).");
        } else if (year >= 1928 && year <= 2020) { // if the user enters year between the range, the
                                                   // movie is
                                                   // displayed
          System.out.println("The movie to win the Best Picture Academy Award in " + year + " is:");
          System.out.println(lookup(year).getMovie() + "\n"); // getting the movie of that year
          int newOption = subMenu(); // Additional options once the movie is displayed
          while (newOption != 3) {
            if (newOption == 1) { // displaying the plot of the movie
              System.out.println(lookup(year).getPlot() + "\n");
              newOption = subMenu();
            } else if (newOption == 2) { // displaying the cast of the movie
              System.out.println(lookup(year).getCast() + "\n");
              newOption = subMenu();
            } else if (newOption == 3) { // going back to the main menu
              break;
            } else {
              System.out.println("Please enter [1],[2] or [3]"); // if the user enters any other
                                                                 // number
              newOption = subMenu();
            }
          }
        } else if (year < 1928) { // If the user enters an year before Academy Awards started
          System.out.println("Sorry. Academy awards didn't exist then" + "\n");
        } else { // if the user enters an year after 2020
          System.out.println("Sorry. We can't predict future Academy Awards \n");
        }

      } else if (option == 2) {
        break; // exit the application
      } else { // The user selected an incorrect option
        System.out.println("Error! Inappropriate option chosen. Please try again."); // if option is
                                                                                     // out of
                                                                                     // bounds
      }
      option = chooseOption();
    }

  }

  /**
   * Display options for the main menu and get the option chosen by the users
   * 
   * @return int - the option chosen by the user
   **/
  public static int chooseOption() {
    System.out.println("MAIN COMMAND MENU:"); // Displaying the options of the main menu
    System.out
        .println("[1] Find the movie that was awarded Best Picture Academy award for any year");
    System.out.println("[2] Exit");

    int option = sc.nextInt();
    return option; // returning the users option
  }

  /**
   * Display the options of the additional menu and get the option chosen by the users
   * 
   * @return int - the option chosen by the user
   */
  public static int subMenu() {
    System.out.println("ADDITIONAL COMMAND MENU:");// Displaying the options of the additional menu
    System.out.println("[1] View the plot of the movie");
    System.out.println("[2] View the cast of the movie");
    System.out.println("[3] Go back to Main Command Menu");
    int option = sc.nextInt();// Storing the users option
    return option; // returning the users option
  }

}
