/*
 * Treasure Chandler
 * CS 16000-01 - 03, Fall Semester 2024
 * Lab 02
 */

/*
 * Task class is responsible for:
 * Solving programming challenge #4 Star Pattern at the end of Chapter
 * 2, "Programming challenges" with the below added requirements
 */

import javax.swing.JOptionPane; // required for the JOptionPane class

public class StarPattern {
    /**
     * 
     * @param args      // entered values
     */
    public static void main(String[] args) {
        // variables declaration
        // problem 4:
        /*
         * this will hold the address of a String object with a
         * string literal as its value
         */
        String pattern;
        /*
         * the output of the constructStarsPattern() method, which is
         * the star pattern shown in Figure 1
         */
        pattern = constructStarsPattern();

        // problem 5:
        // title is used as a reference variable
        String title = "Stars_Pattern";

        displayStarsPattern(title, pattern);
        displayStarsPatternInMessageBox(title, pattern);

        // problem 7:
        /*
         * this variable is meant to display the number of asterisks
         * in the star pattern
         */
        int asterisks;

        // // problem 8:
        // System.out.println("The number of * symbols in the lines of the " +
        //                     "pattern are");
        
        System.exit(0); // required for the JOptionPane class

    } // end of main()

    // problem 1:
    /**
     * 
     * @return      // returns the String value of the pattern variable
     */
    public static String constructStarsPattern() {
        // problem 2:
        /*
         * this string value is a description of the star pattern given
         * in problem 1. it will be returned in the address where the
         * star pattern is stored
         */
        String pattern = "\n     * \n" +
                         "    * *\n" +
                         "   * * *\n" +
                         "  * * * *\n" +
                         " * * * * *\n" +
                         "* * * * * *\n" +
                         " * * * * *\n" +
                         "  * * * *\n" +
                         "   * * *\n" +
                         "    * *\n" +
                         "     *";

        return pattern;

    } // end of constructStarsPattern()

    // problem 5:
    /**
     * 
     * @param title     // reference variable which would be the title
     *                  // "Stars_Pattern"
     * @param pattern   // variable that displays the star pattern itself
     */
    public static void displayStarsPattern(String title, String pattern) {
        // this code below prints the star pattern to the console
        // problem 5(a):
        System.out.println("5a. The number of characters in the pattern is " +
                            pattern.length());
        // problem 5(b):
        System.out.printf("5b. The number of characters in the pattern is %s",
                            pattern.length() +
                            "\n");
        System.out.println(title + " " + pattern);
        // problem 5(c):
        System.out.println("5c. The stars' pattern is:" + 
                           "\n" +
                           pattern);
        System.out.printf("5d. The stars' pattern is: " +
                          "\n" +
                          "%s",
                          pattern);
        
    } // end of diaplayStarsPattern(String title, String pattern)

    /**
     * 
     * @param title     // reference variable which would be the title
     *                  // "Stars_Pattern"
     * @param pattern   // variable that displays the star pattern itself
     */
    public static void displayStarsPatternInMessageBox(String title, String pattern) {
        /*
         * however, this code below prints the star pattern in
         * the popup dialogue windows!
         */
        // problem 5(e):
        /*
         * if you do not include "JOptionPane.INFORMATION_MESSAGE" in the
         * showMessageDialog method parameters for 5e to 5h, there will
         * be an error thrown describing the method is not applicable for
         * the arguments (null, String, String) because there needs to be
         * a parameter that returns a string
         */
        JOptionPane.showMessageDialog(null,
                                      pattern, "5e. " + title,
                                      JOptionPane.INFORMATION_MESSAGE);
        // problem 5(f):
        JOptionPane.showMessageDialog(null,
                                      "The number of characters in the pattern is " +
                                      pattern.length(),
                                      "5f. " + title,
                                      JOptionPane.INFORMATION_MESSAGE);
        // problem 5(g):
        JOptionPane.showMessageDialog(null,
                                      pattern, "5g. " + title,
                                      JOptionPane.INFORMATION_MESSAGE);
        // problem 5(h):
        JOptionPane.showMessageDialog(null, "The pattern is:" + pattern,
                                     "5g. " + title,
                                     JOptionPane.INFORMATION_MESSAGE);

    } // end of displayStarsPatternInMessageBox(String title, String pattern)

} // end of StarPattern
