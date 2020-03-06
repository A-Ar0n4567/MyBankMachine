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
//Bank name, inital balance constructor
public class ATM {
    
    //Variables
    private double depositAmount,withdrawlAmount,balance,interest;
    private String bankName;
    
    String input;
    
    public ATM(String BankName, Double Balance){
    
        bankName = BankName;
        balance = Balance;
    }
    //Deposit
    public void Deposit(){
    
        boolean done = false;
        
        while(!done){
            
            input = JOptionPane.showInputDialog(bankName+"  Balance: "+balance+"\nEnter amount you want to deposit");
            depositAmount = Double.parseDouble(input);
            
            if(depositAmount < 0){
            
                System.out.println("Cannot add negative money bro");
            }else{
            
                balance += depositAmount;
                System.out.println("$"+input+" Has Been Deposited. Your Balance is Now: $"+(depositAmount+balance));
                done = true;
            }
        }
    }
    
    //withdraw
    public void Withdraw(){
    
        //Stupid Proofing
        boolean done = false;
        
        while(!done){
            input = JOptionPane.showInputDialog("Enter Amount You Want to Withdraw:");
            withdrawlAmount = Double.parseDouble(input);
            
            if(withdrawlAmount > balance){

                System.out.println("Insufficient Funds. \n Current Balance: "+balance);

            }else{
                balance -=withdrawlAmount;
                System.out.println("$"+withdrawlAmount+" Has Been Withdrawn From Your Account. Your Current Balance is: $"+balance);
                done = true;
            }
        }   
    }
    //display Balance
    public void Balance(){
        
        System.out.println("Your Current Balance is: "+balance);
    }
    //add daily interest
    
    public void Interest(){
        
        boolean done = false;
        
        while(!done){
        
            double finalAmount,principalAmount,interestRate,compounds;
            String principalInput,interestInput,compoundInput;
            //get principal
            principalInput = JOptionPane.showInputDialog("Enter Principal Amount:");
            principalAmount = Double.parseDouble(principalInput);

            //get interestRate
            interestInput = JOptionPane.showInputDialog("Enter Interest Rate as a Decimal:");
            interestRate = Double.parseDouble(interestInput);

            //get compound period
            compoundInput = JOptionPane.showInputDialog("Enter Compound Period in Days:");
            compounds = Double.parseDouble(compoundInput);

            //Math Time

            finalAmount = (principalAmount*Math.pow(1+interestRate,compounds));

            
            //display final amount
            balance = (double) Math.round(balance*100)/100;
            finalAmount = (double) Math.round(finalAmount*100)/100;
            
            if(finalAmount > Double.POSITIVE_INFINITY){
            
                System.out.println("Error! You have Infinite Money");
            }else{
            
                balance += finalAmount;
                System.out.println("The Final Amount From Daily Interest is: "+finalAmount);
                System.out.println("Your Current Balance is Now: "+ balance);
                done = true;
            }
            
           
        }
        
        
        
    }
    
    
}
