package sirikhojornsombut.jedsada.taTestlab.lab5;

public class GradeSystemProcedural {

    static String determineGrade(double average) {
        int Grade = (int) average;
        // A: 80-100, B: 70-79, C: 60-69, D: 50-59, F: 0-49
        if (Grade >= 80 && Grade <= 100) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    static void displayStudent(String id, String name, double[] scores, int index) {
        // Display: ID, Name, Scores, Average, Grade, Status
        double average = 0;
        for (double score : scores) {
            average += score;
        }
        average /= scores.length;
        String grade = determineGrade(average);
        String status = (grade.equals("F")) ? "Fail" : "Pass";

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        System.out.println();
    }

    static void displayAllStudents(String[] ids, String[] names,
            double[][] scores) {
        for (int i = 0; i < ids.length; i++) {
            displayStudent(ids[i], names[i], scores[i], i);
        }
    }

    static String searchByID(String searchID, String[] ids,
            String[] names, double[][] scores) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(searchID)) {
                StringBuilder result = new StringBuilder();
                double average = 0;
                for (double score : scores[i]) {
                    average += score;
                }
                average /= scores[i].length;
                String grade = determineGrade(average);
                String status = (grade.equals("F")) ? "Fail" : "Pass";

                result.append("ID: ").append(ids[i]).append("\n");
                result.append("Name: ").append(names[i]).append("\n");
                result.append("Scores: ");
                for (int j = 0; j < scores[i].length; j++) {
                    result.append(scores[i][j]);
                    if (j < scores[i].length - 1) {
                        result.append(" ");
                    }
                }
                result.append("\n");
                result.append(String.format("Average: %.2f\n", average));
                result.append("Grade: ").append(grade).append("\n");
                result.append("Status: ").append(status).append("\n");

                return result.toString();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        // Sample data for testing
        String[] studentIDs = {"S001", "S002", "S003"};
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        double[][] studentScores = {
            {85.0, 78.5, 92.0}, {67.0, 73.5, 70.0}, {45.0, 48.5, 46.0}
        };
        // Display all students
        System.out.println("=== All Students ===");
        displayAllStudents(studentIDs, studentNames, studentScores);
        // Search for a student by ID
        System.out.println("=== Search Student by ID S002===");
        String searchID = "S002";
        String result = searchByID(searchID, studentIDs, studentNames, studentScores);
        if (!result.isEmpty()) {
            System.out.println(result);
        }
    }
}
