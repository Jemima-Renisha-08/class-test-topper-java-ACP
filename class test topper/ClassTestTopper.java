import java.util.Scanner;

public class ClassTestTopper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Variables to store the topper's name and highest score
        String topperName = "";
        int highestScore = -1;

        // Loop to get each student's name and score
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            String name = scanner.next();

            System.out.print("Enter the score of " + name + ": ");
            int score = scanner.nextInt();

            // Check if this student has the highest score
            if (score > highestScore) {
                highestScore = score;
                topperName = name;
            }
        }

        // Display the topper's name and score
        System.out.println("The topper is " + topperName + " with a score of " + highestScore + ".");

        // Close the scanner
        scanner.close();
    }
}
