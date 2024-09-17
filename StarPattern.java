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
        // reference variable
        String title = "Stars_Pattern";
        dispayStarsPattern(title, pattern);
        
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
    public static void dispayStarsPattern (String title, String pattern) {
        // problem 5(a):
        System.out.println("The number of characters in the pattern is " +
                            pattern.length());
        System.out.println(title + " " + pattern);
    }

} // end of StarPattern
