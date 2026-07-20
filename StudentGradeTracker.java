  import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"RAJ", "YASHU", "MAHI"};
        int[] marks = {90, 80, 95};

        while (true) {

            System.out.println("\n====================================");
            System.out.println("      STUDENT GRADE TRACKER");
            System.out.println("====================================");
            System.out.println("1. View Student Records");
            System.out.println("2. Display Summary Report");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n------------------------------------");
                    System.out.printf("%-10s %-10s\n", "NAME", "MARKS");
                    System.out.println("------------------------------------");

                    for (int i = 0; i < names.length; i++) {
                        System.out.printf("%-10s %-10d\n", names[i], marks[i]);
                    }
                    break;

                case 2:

                    int total = 0;
                    int highest = marks[0];
                    int lowest = marks[0];
                    String highestStudent = names[0];
                    String lowestStudent = names[0];

                    for (int i = 0; i < marks.length; i++) {

                        total += marks[i];

                        if (marks[i] > highest) {
                            highest = marks[i];
                            highestStudent = names[i];
                        }

                        if (marks[i] < lowest) {
                            lowest = marks[i];
                            lowestStudent = names[i];
                        }
                    }

                    double average = (double) total / marks.length;

                    System.out.println("\n========== SUMMARY REPORT ==========");
                    System.out.println("Total Students : " + names.length);
                    System.out.println("Average Marks  : " + average);
                    System.out.println("Highest Marks  : " + highest + " (" + highestStudent + ")");
                    System.out.println("Lowest Marks   : " + lowest + " (" + lowestStudent + ")");
                    System.out.println("====================================");
                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
