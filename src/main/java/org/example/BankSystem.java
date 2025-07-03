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
        System.out.print("Enter Choice (1-5): ");
        int userChoice = userIn.nextInt();
        userIn.nextLine();
        if(userChoice==6){
            exitCondition = true;
        } else if (userChoice==1) {
            System.out.print("Enter account number: ");
            int accountNumber = userIn.nextInt();
            userIn.nextLine();
            System.out.print("Enter account number: ");
            String holderName = userIn.nextLine().toLowerCase();
            System.out.print("Initial deposit? (yes/no): ");
            String depositChoice = userIn.nextLine();
            if(depositChoice.equals("yes")){
                System.out.print("Enter initial deposit amount: ");
                int depositAmount = userIn.nextInt();
                userIn.nextLine();
                if (depositAmount>0){
//                    add function call to deposit
                    System.out.println("Account Created Successfully");
                }else{
                    System.out.println("Invalid ");
                }
                System.out.println("Would you like to return to the main menu? (yes/no): ");
            } else if (depositChoice.equals("no")) {
//            Add function call here
                System.out.println("Account Created Successfully!");
                System.out.println("Would you like to return to the main menu? (yes/no): ");
            }else {
                System.out.println("Invalid input");
            }
        }

        // Add "Would you like to return to the main menu? (yes/no): 
    }
}
}