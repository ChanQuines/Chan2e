package channy;


 import java.util.Scanner;
 import bankingApp.bankingApp;

public class mainclass{
    
    public static void main(String[] args){
        System.out.println("ACTIVITY 1!");
                Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MY SYSTEM!");

        System.out.println("1. Banking");
        System.out.println("2. Shopping") ;   
        System.out.println("3. Order Food");
                
        System.out.println("Enter Choice: ");
        int selection = sc.nextInt();
        
            switch(selection){
                case 1:
                    bankingApp bapp = new bankingApp();
                    
                    System.out.println("Enter account no:");
                     int accNo = sc.nextInt(); 
                      
                    System.out.println("Enter pin:");
                    int pin = sc.nextInt();
                             
                       if(bapp.verifyAcc(accNo, pin)){
                       System.out.println("LOGIN SUCCESS");
                       }else{
                       System.out.println("INVALID ACCOUNT");                   
                                }                     
                    break;
                case 2:
                    break;
                case 3:
                    break;
              
                default:
                System.out.println("Invalid Selection!");
                
            }
                           
    }
}