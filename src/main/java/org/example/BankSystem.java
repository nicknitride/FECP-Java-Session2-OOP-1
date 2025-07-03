package org.example;
import java.util.Scanner;
public class BankSystem {

    static void displayMenu(){
        System.out.println("=== Bank Menu ===");
        System.out.println("1. Create Account");
        System.out.println("2. View All Accounts");
        System.out.println("3. Check Balance");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Exit");

    }
    public static void main(String[] args) {
    boolean exitCondition = false;
    Scanner userIn = new Scanner(System.in);
    while (!exitCondition){
        displayMenu();
        System.out.print("Enter Choice: ");
        int userChoice = userIn.nextInt();
        userIn.nextLine();
        if(userChoice==6){
            exitCondition = true;
        }
    }
}
}