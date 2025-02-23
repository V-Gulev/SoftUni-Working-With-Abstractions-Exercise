package StudentSystem_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String[] input = sc.nextLine().split(" ");

        while (!input[0].equals("Exit")) {
            studentSystem.parseCommand(input);
            input = sc.nextLine().split(" ");
        }

    }
}
