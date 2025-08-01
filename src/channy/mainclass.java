package channy;


 import java.util.Scanner;
 import bankingApp.bankingApp;

public class Main {
    
    public static void(string[] args){
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("1. Banking");
        System.out.println("2. Shopping") ;   
        System.out.println("3. Order Food");
                
        System.out.println("Enter Choice: ");
        int selection = sc.nextInt();
        
            switch(selection){
                case 1:
                    bankingApp bapp = new bankingApp();
                        System.out.println("Enter account no:")
                        int acct = sc.nextInt();
                        System.out.println("Enter pin:")
                        int pin = sc.nextInt();
                             
                             if(bapp.verifyAcc(acct, pin))  {
                                 System.out.printIn("LOGIN SUCCESS")
                             }else{
                                 System.out.printIn("INVALID ACCOUNT")
                             }
                                
                         
                        
                    break
                case 2:
                    break
                case 3:
                    break
              
                
            }
    }
}