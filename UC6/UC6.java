/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 * 
 * Modular approach: Each letter pattern is generated using
 * separate methods to improve reusability and maintainability.
 * 
 * @author Developer
 * @version 6.0
 */

public class UC6 {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " *   * ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  *****",
            " *     ",
            " *     ",
            "  **** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}