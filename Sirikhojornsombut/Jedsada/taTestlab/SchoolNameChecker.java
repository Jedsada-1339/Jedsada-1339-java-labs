package sirikhojornsombut.jedsada.taTestlab;

public class SchoolNameChecker {

    public static void main(String[] args) {
        // Validate argument count
        if (args.length != 1) {
            System.err.println("Error: Invalid number of arguments. Please provide exactly one argument.");
            return;
        }

        // Save the input argument
        String schoolName = args[0];

        // Convert to lowercase for case-insensitive comparison
        String schoolNameLower = schoolName.toLowerCase();

        // Check if the name contains "university" or "college"
        if (schoolNameLower.contains("university")) {
            System.out.println(schoolName + " is a university");
        } else if (schoolNameLower.contains("college")) {
            System.out.println(schoolName + " is a college");
        } else {
            System.out.println(schoolName + " is neither a university nor a college");
        }
    }
}
