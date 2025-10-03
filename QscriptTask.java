package qs;

import java.util.ArrayList;
import java.util.Scanner;

public class QscriptTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Design Database Schema"));
        tasks.add(new Task("Develop user authentication module"));
        tasks.add(new Task("Setup cloud infrastructure"));
        tasks.add(new Task("Api integration"));
        tasks.add(new Task("UI design"));

        boolean appRunning = true;
        while (appRunning) {
            System.out.print("\nEnter your username (or type '0' to quit): ");
            String user = sc.nextLine();

            if (user.equalsIgnoreCase("0")) {
                appRunning = false;
                break;
            }

            boolean userRunning = true;

            while (userRunning) {
                System.out.println("\nTask List");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    tasks.get(i).displayTask();
                }

                System.out.print("\nSelect a task number to mark completed (0 to logout): ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 0) {
                    userRunning = false;
                } else if (choice > 0 && choice <= tasks.size()) {
                    tasks.get(choice - 1).markCompleted(user);
                    System.out.println("Task marked as completed by " + user);
                } else {
                    System.out.println("Invalid choice! Try again.");
                }
            }
        }
        System.out.println("\nTask Status");
        for (Task task : tasks) {
            task.displayTask();
        }
        sc.close();
    }
}
