/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;
import java.util.Scanner;
public class ATM {
        
       private String bank, receipt;
       private int Pin,depMoney, cashWithdrawal, iniBalance;
       private double A, P, i, n; // A = final amount, P = principal amount
                                  // i = interest rate per compound period
                                  // n = number of compound periods

       
       // creating a Scanner constructor
           Scanner sc = new Scanner(System.in);
           
       public ATM()
       {
            System.out.println(" choose a Bank ");
            System.out.println("1. BMO /n 2.Royal Bank /n TD Bank");
            bank = sc.nextLine();
            
            if (bank == "BMO")
            {
                System.out.println("thanks for choosing BMO");
            }
            else if(bank == "Royal Bank")
                {
                    System.out.println("Royal Bank has been chosen");          
                }
            else{
                   System.out.println("TD bank has been chosen");   
                }
        }
        public ATM(String bank, int currBalance){
            
        }
}
