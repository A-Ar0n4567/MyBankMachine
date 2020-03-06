/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;
import javax.swing.*;
/**
 *
 * @author aamir7110
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //bank menu
        ATM atm = new ATM("RBC",5435.0);
        //menu loop
        boolean done = false;
        
        while(!done){
        
             String choice = JOptionPane.showInputDialog("Enter the Number of the Option You Would Like to Choose: \n 1: Deposit \n 2: Withdraw:\n 3: Display Balance: \n 4: Daily Compound Interest \n 5: Close Program");
            if(choice.equals("1")){
                atm.Deposit();
            }else if(choice.equals("2")){
                atm.Withdraw();
            }else if(choice.equals("3")){
                atm.Balance();
            }else if(choice.equals("4")){
                atm.Interest();
            }else if(choice.equals("5")){
                done = true;
            }
        }
        
        
        
       
  }
}
