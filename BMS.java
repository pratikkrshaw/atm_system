/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bms;
import java.util.*;
/**
 *
 * @author SHAW
 */

public class BMS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        sav savings=new sav();
        curr current=new curr();
        int opt;
        System.out.print("Enter Account Type:");
        char choice=s.next().charAt(0);
        if(choice=='c' || choice=='C'){
            current.get_acc(choice);
            current.display();
            do{
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawl");
                System.out.println("3. Balance Enquiry");
                System.out.println("0. Exit");
                opt=s.nextInt();
                double cash;
                switch(opt){
                    case 1: System.out.print("Enter Amount to Deposit:");
                            cash=s.nextDouble();
                            current.deposit(cash);
                            break;//savings.display();
                    case 2: System.out.print("Enter Amount to Withdrawl:");
                            cash=s.nextDouble();
                            current.withdrawl(cash);
                            break;
                    case 3: System.out.println("Balance: "+current.balance);
                            break;
                    case 0: System.exit(0);
                    default: System.out.println("Invalid choice!");
                }
                
            }while(opt!=0);
            
            
        }else if(choice=='s' || choice=='S'){
            savings.get_acc(choice);
            savings.display();
            do{
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawl");
                System.out.println("3. Balance Enquiry");
                System.out.println("0. Exit");
                opt=s.nextInt();
                double cash;
                switch(opt){
                    case 1: System.out.print("Enter Amount to Deposit:");
                            cash=s.nextDouble();
                            savings.deposit(cash);
                            break;//savings.display();
                    case 2: System.out.print("Enter Amount to Withdrawl:");
                            cash=s.nextDouble();
                            savings.withdrawl(cash);
                            break;
                    case 3: System.out.println("Balance: "+savings.balance);
                            break;
                    case 0: System.exit(0);
                    default: System.out.println("Invalid choice!");
                }
                
            }while(opt!=0);
        }else
            System.out.println("Invalid Account Type!");
    }
}
