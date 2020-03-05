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
    
        input = JOptionPane.showInputDialog(bankName+"  Balance: "+balance+"\nEnter amount you want to deposit");
        depositAmount = Double.parseDouble(input);
        balance += depositAmount;
        System.out.println(input+" Has Been Deposited. Your Balance is Now: "+(depositAmount+balance));
    }
    
    //withdraw
    public void Withdraw(){
    
        input = JOptionPane.showInputDialog("Enter Amount You Want to Withdraw:");
        withdrawlAmount = Double.parseDouble(input);
        balance -=withdrawlAmount;
        System.out.println(withdrawlAmount+" Has Been Withdrawn From Your Account. Your Current Balance is: "+balance);
        
    }
    //display Balance
    public void Balance(){
        
        System.out.println("Your Current Balance is: "+balance);
    }
    //add daily interest
    
    public void Interest(){
        
        double finalAmount,principalAmount,interestRate,compounds;
        String principalInput,interestInput,compoundInput;
        //get principal
        principalInput = JOptionPane.showInputDialog("Enter Principal Amount:");
        principalAmount = Double.parseDouble(principalInput);
        
        //get interestRate
        interestInput = JOptionPane.showInputDialog("Enter Interest Rate:");
        interestRate = Double.parseDouble(interestInput);
        
        //get compound period
        compoundInput = JOptionPane.showInputDialog("Enter Compound Period:");
        compounds = Double.parseDouble(compoundInput);
        
        //Math Time
        
        finalAmount = (principalAmount*Math.pow(1+interestRate,compounds));
        
        balance += finalAmount;
        //display final amount
        
        System.out.println("The Final Amount From Daily Interest is: "+finalAmount);
        System.out.println("Your Current Balance is Now: "+balance);
        
    }
    //Bank name, inital balance constructor
    
}
