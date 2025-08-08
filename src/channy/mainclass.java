package channy;


 import java.util.Scanner;
 import bankingApp.bankingApp;

public class mainclass{
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response;
        bankingApp bapp[] = new bankingApp[99];
        bapp[0] = new bankingApp();
        int maxAccounts = 99;
    do{ 
    
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you fell like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
            switch(choice){
                case 1:
                    int accn, pin;
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Exit");
                    System.out.print("Enter Action: ");
                    int action = sc.nextInt();
                        
                        switch(action){
                            
                            case 1:    
                         
                                 for (int i = 0; i< maxAccounts ; i++) {
                                 System.out.println("Enter Account No. for account " + (i+1) + ": ");
                                bapp[i].setAccNo(sc.nextInt());
                                  System.out.print("Enter Pin No. for account " + (i+1) + ": ");
                                bapp[i].setPin(sc.nextInt());
                                System.out.println("Registered Accout No: "+bapp[i].getAccNo());
                                break;
                                 }
                                 break;
                                 
                             case 2:
                                System.out.print("Enter Account No.: ");
                                accn = sc.nextInt();
                                System.out.print("Enter Pin No.: ");
                                pin = sc.nextInt();
                            
                                int attempts = 3;
                                
                                while(!(bapp[0].verifyAccount(accn, pin))){
                                    attempts--;
                                    System.out.println("Inalid account, Attempts Left: "+attempts);
                                    if(attempts == 0){
                                        System.out.println("MAX ATTEMPT LIMIT REACHED!");
                                        System.exit(0);
                                    }
                                        System.out.print("Enter Account No.: ");
                                        accn = sc.nextInt();
                                        System.out.print("Enter Pin No.: ");
                                        pin = sc.nextInt();
                                }

                                System.out.println("LOGIN SUCCESS!");
                                
                                
                            break;
                            case 3:
                                break;
                            default:
                                System.out.println("INVALID ACTION");
                        
                        }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                    
                default:
                    System.out.println("INVALID ACTION!");
            
            }
        System.out.println("Continue? (1/0): ");
        response = sc.nextInt();
        }while(response == 1);
    
    }
}

