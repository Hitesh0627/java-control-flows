public class SpringSeason {

    public static void main(String[] args) {
        // Check if the correct number of arguments is passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments: month and day.");
            return;
        }

        // Parse the arguments to integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the month and day are within the spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // Method to determine if it's Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Spring Season is from March 20 (month 3) to June 20 (month 6)
        if (month > 3 && month < 6) {
            return true;
        } else if (month == 3 && day >= 20) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }
}
