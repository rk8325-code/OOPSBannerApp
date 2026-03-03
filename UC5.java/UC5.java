/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 * 
 * This use case defines and populates the String array in a concise way
 * using String.join() to create each row of the banner.
 * 
 * @author Developer
 * @version 5.0
 */

public class UC5 {

    public static void main(String[] args) {

        // Each line represents one row of the banner for O O P S
        String[] lines = {

            String.join(" ",  " *** ",  " *** ", "*****",  " **** "),
            String.join(" ", " *   *", " *   *", "*   *", " *     "),
            String.join(" ", " *   *", " *   *", "*   *", " *     "),
            String.join(" ", " *   *", " *   *", "*****",  " **** "),
            String.join(" ", " *   *", " *   *", "*      ", "     *"),
            String.join(" ", " *   *", " *   *", "*      ", "     *"),
            String.join(" ",  " *** ",  " *** ", "*      ", " **** ")
        };

        // Enhanced for loop to print each banner line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}