package util.dataEntry;

import java.util.Scanner;

public class UserDataEntry {

    public UserDataEntry(Scanner scanner) {
    }

    public double prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    public String getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the math operation (*, +, /, -) : ");
        return scanner.nextLine();
    }

    public String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.println("press any key to continue");
        System.err.println("to exit press q");
        return in.nextLine();
    }
}
