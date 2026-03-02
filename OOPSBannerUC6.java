public class OOPSBannerUC6 {

    // Helper method for letter O
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " **     **",
            "**       *",
            "**       *",
            "**       *",
            " **     **",
            "  *****  "
        };
    }

    // Helper method for letter P
    public static String[] getPPattern() {
        return new String[] {
            " ******  ",
            " **    **",
            " **    **",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        };
    }

    // Helper method for letter S
    public static String[] getSPattern() {
        return new String[] {
            "  *****  ",
            " **     *",
            " **      ",
            "  *****  ",
            "       **",
            "*      **",
            "  *****  "
        };
    }

    public static void main(String[] args) {

        // Get patterns using helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print banner line by line
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