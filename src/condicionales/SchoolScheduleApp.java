package condicionales;
import java.util.Scanner;
public class SchoolScheduleApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Welcome to School ***");
        System.out.print("Please enter the student's age: ");

        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            String schedule = getScheduleByAge(age);
            System.out.println(schedule);
        } else {
            System.out.println("Invalid input. Please enter a valid age in numeric format.");
        }

        scanner.close();
    }

    /**
     * Returns the class schedule based on student's age.
     *
     * @param age Student's age
     * @return Schedule information as a String
     */
    private static String getScheduleByAge(int age) {
        if (age >= 4 && age <= 6) {
            return "Kinder Schedule: Monday and Wednesday from 4:00 PM to 5:00 PM.";
        } else if (age >= 7 && age <= 8) {
            return "1st Year Schedule: Tuesday and Thursday from 4:30 PM to 5:30 PM.";
        } else if (age >= 9 && age <= 10) {
            return "2nd Year Schedule: Tuesday and Thursday from 5:30 PM to 7:00 PM.";
        } else if (age >= 11 && age <= 13) {
            return "3rd Year Schedule: Monday and Wednesday from 5:00 PM to 6:30 PM.";
        } else {
            return "The entered age is not eligible for any group. Please contact the administrator.";
        }
    }
}
