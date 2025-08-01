package bankingApp;


public class bankingApp{
    
    
    int accNo = 1000;
    float initialBalance = 0;
    int pin=1234;    
         public boolean verifyAcc(int acc, int pn)?{
             
             if(acc == accNo && pin == pin){
                 return true;
             }else{
                 return false;
             }
         }
    
    
    
    
    
}