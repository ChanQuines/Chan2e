package channy;


import java.util.Scanner;
import bankingApp.bankingApp;

public class mainclass {
    
    
    public static void main(String[] args) {
        
    
        try (Scanner sc = new Scanner(System.in)) {
            int response;
            
            int maxAccounts = 99;
            bankingApp bapp[] = new bankingApp[maxAccounts];
            
            do {
                System.out.println("WELCOME TO MY SYSTEM!");
                System.out.println("SELECT TRANSACTION: ");
                System.out.println("1. Banking");
                System.out.println("2. Shopping");
                System.out.println("3. Pay Bills");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        int accn, pin;
                        System.out.println("1. Register");
                        System.out.println("2. Login");
                        System.out.println("3. Exit");
                        System.out.print("Enter Action: ");
                        int action = sc.nextInt();
                        
                        switch (action) {
                            case 1:
                                for (int i = 0; i < maxAccounts; i++) {
                                    if (bapp[i] == null) {
                                        bapp[i] = new bankingApp();
                                        System.out.print("Enter Account No. for account " + (i + 1) + ": ");
                                        bapp[i].setAccNo(sc.nextInt());
                                        System.out.print("Enter Pin No. for account " + (i + 1) + ": ");
                                        bapp[i].setPin(sc.nextInt());
                                        System.out.println("Registered Account No: " + bapp[i].getAccNo());
                                        break;
                                    }
                                }
                                break;
                                
                            case 2:
                                int attempts = 3;
                                boolean loginSuccess = false;
                                
                                while (attempts > 0 && !loginSuccess) {
                                    System.out.print("Enter Account No.: ");
                                    accn = sc.nextInt();
                                    System.out.print("Enter Pin No.: ");
                                    pin = sc.nextInt();
                                    
                                    for (int i = 0; i < maxAccounts; i++) {
                                        if (bapp[i] != null && bapp[i].verifyAccount(accn, pin)) {
                                            System.out.println("LOGIN SUCCESS!");
                                            loginSuccess = true;
                                            break;
                                        }
                                    }
                                    
                                    if (!loginSuccess) {
                                        attempts--;
                                        System.out.println("Invalid account. Attempts Left: " + attempts);
                                        if (attempts == 0) {
                                            System.out.println("MAX ATTEMPT LIMIT REACHED!");
                                            System.exit(0);
                                        }
                                        
                                    }
                                    
                                }
                                break;
                                
                            case 3:
                                break;
                                
                            default:
                                System.out.println("INVALID ACTION");
                                
                        }
                        break;
                    case 2:
                        // This case is empty and can be removed or filled with shopping logic
                        break;
                    case 3:
                        // This case is empty and can be removed or filled with bill payment logic
                        break;
                        
                     default:
                        System.out.println("INVALID ACTION!");
                        
                }
                System.out.print("Continue? (1/0): ");
                response = sc.nextInt();
            } while (response == 1);
        }
    }
}