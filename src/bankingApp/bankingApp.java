package bankingApp;

import java.util.Scanner;

public class bankingApp{
    
    
    int accNo = 1000;
    float initialBalance = 0;
    int pin=1234;    
         public boolean verifyAcc(int acc, int pn){
             
        return acc == accNo && pn == pin;
         }
    
    
    
    
    
}