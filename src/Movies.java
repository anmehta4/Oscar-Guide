// --== CS400 File Header Information ==--
// Name: Arnav Mehta / Sankalp
// Email: anmehta4@wisc.edu
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

public class Movies implements Comparable<Movies> {
  private String[][] movieList = new String[1][3];
  private int year;

  /**
   * Constructor for the class Movies
   * 
   * @param movieName - String name of the Movie
   * @param plot      - String plot of the Movie
   * @param cast      - String case of the Movie
   * @param year      - int year the Movie won an Oscar
   */
  public Movies(String movieName, String plot, String cast, int year) {
    this.movieList[0][0] = movieName;
    this.movieList[0][1] = plot;
    this.movieList[0][2] = cast;
    this.year = year;
  }

  /**
   * Getter Method for the movie name
   * 
   * @return String - name of the movie
   */
  public String getMovie() {
    return movieList[0][0];
  }

  /**
   * Getter Method for the plot of the movie
   * 
   * @return String - plot of the movie
   */
  public String getPlot() {
    return movieList[0][1];
  }

  /**
   * Getter Method for the cast of the movie
   * 
   * @return String - cast of the movie
   */
  public String getCast() {
    return movieList[0][2];
  }

  public String toString() {
    return this.getMovie();
  }

  /**
   * Getter Method for the year of the movie
   * 
   * @return int - year the movie won an Oscar
   */
  public int getYear() {
    return this.year;
  }

  /**
   * Overriding the compareTo method of the Comparable Class. Compares the movies based on the year
   * they won an oscar.
   * 
   * @return int: -1 if the second movie has released after, 0 ifthe movie released in the same
   *         year, else +1
   */
  @Override
  public int compareTo(Movies second) {
    if ((this.getYear() - second.getYear()) < 0)
      return -1;
    else if (this.getYear() == second.getYear())
      return 0;
    else
      return 1;

  }
}
