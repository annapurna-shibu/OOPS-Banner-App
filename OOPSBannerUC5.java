public class OOPSBannerUC5 {

    public static void main(String[] args) {

        // UC5: Inline array initialization using String.join()
        String[] lines = {
            String.join(" ", "*****", " *****", " *****", " *****"),
            String.join(" ", "*   *", " *   *", " *   *", " *   *"),
            String.join(" ", "*   *", " *   *", " *   *", " *   *"),
            String.join(" ", "*****", " *****", " *****", " *****"),
            String.join(" ", "*     ", " *     ", " *     ", " *     "),
            String.join(" ", "*     ", " *     ", " *     ", " *     "),
            String.join(" ", "*****", " *****", " *****", " *****")
        };

        // Enhanced for loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}