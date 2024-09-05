package Marks;

import java.util.Scanner;

public class MountvilleUniversityAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Were you a valedictorian or salutatorian of a school with 1400 or more students? (yes/no): ");
        String valSalStatus = scanner.nextLine().trim().toLowerCase();
        if (valSalStatus.equals("yes")) {
            System.out.println("Congratulations! You are admitted to Mountville University.");
            return;
        }
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter your SAT score: ");
        int satScore = scanner.nextInt();
        boolean isAdmitted = false;
        if (gpa >= 4.0 && satScore >= 1100) {
            isAdmitted = true;
        } else if (gpa >= 3.5 && satScore >= 1300) {
            isAdmitted = true;
        } else if (gpa >= 3.0 && satScore >= 1500) {
            isAdmitted = true;
        }
        if (isAdmitted) {
            System.out.println("Congratulations! You are admitted to Mountville University.");
        } else {
            System.out.println("Sorry, you do not meet the admission criteria for Mountville University.");
        }
    }
}