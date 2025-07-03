package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class BankSystem {
    static ArrayList<BankAccount> BankAccountArray = new ArrayList<>();
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
            System.out.print("Enter Account Holder's Name: ");
            String holderName = userIn.nextLine().toLowerCase();
            System.out.print("Initial deposit? (yes/no): ");
            String depositChoice = userIn.nextLine();
            if(depositChoice.equals("yes")){
                System.out.print("Enter initial deposit amount: ");
                double depositAmount = userIn.nextInt();
                userIn.nextLine();
                if (depositAmount>0){
                    BankAccountArray.add(new BankAccount(holderName,depositAmount,accountNumber));
                    System.out.println("Account Created Successfully");
                }else{
                    System.out.println("Invalid ");
                }

            } else if (depositChoice.equals("no")) {
                BankAccountArray.add(new BankAccount(accountNumber,holderName));
                System.out.println("Account Created Successfully!");
            }else {
                System.out.println("Invalid input");
            }
            System.out.println("Would you like to return to the main menu? (yes/no): ");
            String mainChoice = userIn.nextLine().toLowerCase();
            if(mainChoice.equals("no")){
                exitCondition = true;
            }
        } else if (userChoice==2) {// View All
            System.out.println("Displaying Accounts: ");
            for (int i = 0; i <= BankAccountArray.size()-1 ; i++) {
                System.out.println("------- Account "+(i+1)+"-------");
                BankAccountArray.get(i).displayInfo();
                System.out.println("----------------------------");
            }
            System.out.println("Would you like to return to the main menu? (yes/no): ");
            String mainChoice = userIn.nextLine().toLowerCase();
            if(mainChoice.equals("no")){
                exitCondition = true;
            }
        } else if (userChoice==3) {//Display Balance
            int matchingAccountNumIndex = 0;
            System.out.print("Please enter account number: ");
            int accountGiven = userIn.nextInt();
            userIn.nextLine();
            for (int i = 0; i <= BankAccountArray.size()-1 ; i++) {
                if(BankAccountArray.get(i).getAccountNumber()==accountGiven){
                    matchingAccountNumIndex = i;
                }
            }
            BankAccountArray.get(matchingAccountNumIndex).displayInfo();
            System.out.println("Would you like to return to the main menu? (yes/no): ");
            String mainChoice = userIn.nextLine().toLowerCase();
            if(mainChoice.equals("no")){
                exitCondition = true;
            }
        } else if (userChoice == 4){// Deposit
            int matchingAccountNumIndex = 0;
            System.out.print("Please enter account number: ");
            int accountGiven = userIn.nextInt();
            userIn.nextLine();
            System.out.print("Please enter an amount to deposit: ");
            double depositAmount = userIn.nextDouble();
            userIn.nextLine();
            for (int i = 0; i <= BankAccountArray.size()-1 ; i++) {
                if(BankAccountArray.get(i).getAccountNumber()==accountGiven){
                    matchingAccountNumIndex = i;
                }
            }
            BankAccountArray.get(matchingAccountNumIndex).deposit(depositAmount);
            System.out.println("---------Current-------");
            BankAccountArray.get(matchingAccountNumIndex).displayInfo();
            System.out.println("-----------------------");
        } else if (userChoice==5) {// Withdraw
            int matchingAccountNumIndex = 0;
            System.out.print("Please enter account number: ");
            int accountGiven = userIn.nextInt();
            userIn.nextLine();
            System.out.print("Please enter an amount to withdraw: ");
            double withdrawAmount = userIn.nextDouble();
            userIn.nextLine();
            for (int i = 0; i <= BankAccountArray.size()-1 ; i++) {
                if(BankAccountArray.get(i).getAccountNumber()==accountGiven){
                    matchingAccountNumIndex = i;
                }
            }
            BankAccountArray.get(matchingAccountNumIndex).withdrawAmount(withdrawAmount);
            System.out.println("---------Current-------");
            BankAccountArray.get(matchingAccountNumIndex).displayInfo();
            System.out.println("-----------------------");
        }
    }
}
}