// --== CS400 File Header Information ==--
// Name: Ishita Dhoot / Ankit Reddy
// Email: idhoot@wisc.edu
// Team: LC
// Role: Test engineer
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the functionality of Movies class, OscarGuide class and the
 * RedBlackTree class
 * 
 * @author ishitadhoot
 *
 */
public class TestOscarGuide {

	/**
	 * Tests the functionality of the Movies.java class
	 */
	@Test
	public void testMovies() {
		// Create a Movies type object for the year 1928
		Movies For1928 = new Movies("Wings",
				"Two young men, one rich, " + "one middle class, who are in love with the same woman, become fighter"
						+ " pilots in World War I.",
				"Clara Bow, Charles Rogers, Richard Arlen," + " and Gary Cooper.", 1928);

		// Tests if the functions getYear(), getMovie(), getPlot() and getCast() work
		// correctly
		if (For1928.getYear() != 1928 || !For1928.getMovie().equals("Wings") || !For1928.getPlot().equals(
				"Two young men, one rich, one middle class, who are in love with the same woman, become fighter pilots in World War I.")
				|| !For1928.getCast().equals("Clara Bow, Charles Rogers, Richard Arlen, and Gary Cooper.")) {
			fail("testMovies() failed");
		}
	}

	/**
	 * Tests the functionality of the overridden method compareTo in Movies.java to
	 * check if the objects are being compared correctly
	 */
	@Test
	public void testCompareMovies() {
		// Create Movies for years 1960 and 1970
		Movies For1960 = new Movies("Ben-Hur",
				"When a Jewish prince is betrayed and sent into slavery by a Roman friend, he regains his freedom and comes back for revenge.",
				"Charlton Heston, Jack Hawkins, and Stephen Boyd", 1960);
		Movies For1970 = new Movies("Midnight Cowboy",
				"A naive hustler travels from Texas to New York to seek personal fortune but, in the process, finds himself a new friend.",
				"Dustin Hoffman, Jon Voight, and Sylvia Miles.", 1970);
		// Tests if Movies objects are being compared rightly
		if (For1960.compareTo(For1970) >= 0) {
			fail("testCompareMovies() failed");
		}
	}

	/**
	 * This method will test the functionality of both the red black tree insert
	 * operation and the lookup method from the OscarGuide.java class
	 */
	@Test
	public void testInsertMovies() {
		RedBlackTree<Movies> tree = new RedBlackTree<Movies>(); // create a test tree

		// adding a few Movies Objects
		tree.insert(MovieList.For1928);
		tree.insert(MovieList.For1929);
		tree.insert(MovieList.For1930);
		tree.insert(MovieList.For1931);
		tree.insert(MovieList.For1932);
		tree.insert(MovieList.For1934);
		tree.insert(MovieList.For1935);

		// tests if the movies got added and looking them up results in reaching the
		// right node
		if (OscarGuide.lookupHelper(new Movies("", "", "", 1931), tree.root).getYear() != 1931
				|| OscarGuide.lookupHelper(new Movies("", "", "", 1929), tree.root).getYear() != 1929
				|| OscarGuide.lookupHelper(new Movies("", "", "", 1935), tree.root).getYear() != 1935) {
			fail("testInsertMovies() failed");
		}
	}

	/**
	 * Tests how the app handles user inputs that go beyond the range of Academy
	 * Awards years (1900 and 2050)
	 * 
	 * @throws FileNotFoundException should the testing file not be in the directory
	 */
	@Test
	public void testCornerYears() throws FileNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out; // Saves the old System.out
		System.setOut(ps); // Tells Java to use your special stream
		File file = new File("cornerYears.txt"); // This file simulates user inputs with corner years and finally the
													// option to quit the application
		OscarGuide.sc = new Scanner(file);
		OscarGuide.runOscarGuide(); // runs the app
		System.out.flush(); // Captures the output
		System.setOut(old);
		String expected = "MAIN COMMAND MENU:\n"
				+ "[1] Find the movie that was awarded Best Picture Academy award for any year\n" + "[2] Exit\n"
				+ "Please enter an year between 1928 to 2020\n" + "Sorry. Academy awards didn't exist then\n" + "\n"
				+ "MAIN COMMAND MENU:\n"
				+ "[1] Find the movie that was awarded Best Picture Academy award for any year\n" + "[2] Exit\n"
				+ "Please enter an year between 1928 to 2020\n" + "Sorry. We can't predict future Academy Awards \n"
				+ "\n" + "MAIN COMMAND MENU:\n"
				+ "[1] Find the movie that was awarded Best Picture Academy award for any year\n" + "[2] Exit\n";
		if (!baos.toString().equals(expected)) { // Captured output is converted to a string and compared with expected
													// results
			fail("testCornerYears() failed");
		}

	}

	/**
	 * Tests how the app handles user inputs that select option numbers that are
	 * beyond the number of options provided in that menu
	 * 
	 * @throws FileNotFoundException should the testing file not be in the directory
	 */
	@Test
	public void testIncorrectOption() throws FileNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out; // Saves the old System.out
		System.setOut(ps); // Tells Java to use your special stream
		File file = new File("incorectOption.txt"); // This file simulates user inputs and contains the incorrect option
													// numbers for the main menu
		OscarGuide.sc = new Scanner(file);
		OscarGuide.runOscarGuide(); // runs the app
		System.out.flush(); // Captures the output
		System.setOut(old);
		String expected = "MAIN COMMAND MENU:\n"
				+ "[1] Find the movie that was awarded Best Picture Academy award for any year\n" + "[2] Exit\n"
				+ "Error! Inappropriate option chosen. Please try again.\n" + "MAIN COMMAND MENU:\n"
				+ "[1] Find the movie that was awarded Best Picture Academy award for any year\n" + "[2] Exit\n";
		if (!baos.toString().equals(expected)) {// Captured output is converted to a string and compared with expected
												// results
			fail("testIncoorectOptions() failed");
		}

	}

	/**
	 * Tests the functionality of the app provided that all user inputs are right.
	 * The txt file is simulating a user that is looking up the movie that won the
	 * Best Picture Academy Award in 2010 and is looking up its plot and cast.
	 * 
	 * @throws FileNotFoundException should the testing file not be in the directory
	 */
	@Test
	public void testOscarGuide() throws FileNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		PrintStream old = System.out; // Saves the old System.out
		System.setOut(ps); // Tells Java to use your special stream
		File file = new File("correctOptions.txt"); // This file simulates user inputs and contains the incorrect option
													// numbers for the main menu
		OscarGuide.sc = new Scanner(file);
		OscarGuide.insertAllMovies();
		OscarGuide.runOscarGuide(); // runs the app
		System.out.flush(); // Captures the output
		System.setOut(old);
		String expected = "MAIN COMMAND MENU:\n"
				+ "[1] Find the movie that was awarded Best Picture Academy award for any year\n" + "[2] Exit\n"
				+ "Please enter an year between 1928 to 2020\n"
				+ "The movie to win the Best Picture Academy Award in 2010 is:\n" + "The Hurt Locker\n" + "\n"
				+ "ADDITIONAL COMMAND MENU:\n" + "[1] View the plot of the movie\n" + "[2] View the cast of the movie\n"
				+ "[3] Go back to Main Command Menu\n"
				+ "During the Iraq War, a Sergeant recently assigned to an army bomb squad is put at odds with his squad mates due to his maverick way of handling his work.\n"
				+ "\n" + "ADDITIONAL COMMAND MENU:\n" + "[1] View the plot of the movie\n"
				+ "[2] View the cast of the movie\n" + "[3] Go back to Main Command Menu\n"
				+ "Jeremy Renner, Anthony Mackie, and Brian Geraghty. \n" + "\n" + "ADDITIONAL COMMAND MENU:\n"
				+ "[1] View the plot of the movie\n" + "[2] View the cast of the movie\n"
				+ "[3] Go back to Main Command Menu\n" + "MAIN COMMAND MENU:\n"
				+ "[1] Find the movie that was awarded Best Picture Academy award for any year\n" + "[2] Exit\n";
		if (!baos.toString().equals(expected)) {// Captured output is converted to a string and compared with expected
												// results
			fail("testOscarGuide() failed");
		}

	}
}