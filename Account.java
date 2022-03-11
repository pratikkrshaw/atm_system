/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

import java.util.Scanner;

/**
 *
 * @author SHAW
 */
public class Account {
    String cust_name;
    int acc_no;
    char acc_type;
    double balance;
    int min_balance=1000;
    public void get_acc(char choice){ 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Customer Name:");
        cust_name=sc.nextLine();
        System.out.print("Enter Account No:");
        acc_no=sc.nextInt();
        //System.out.print("Enter Account Type:");
        this.acc_type=choice;
        System.out.print("Enter Balance:");
        balance=sc.nextDouble();
    }
    public void display(){
        System.out.println("Customer Name:"+cust_name);
        System.out.println("Account No.:"+acc_no);
        System.out.println("Account Type:"+acc_type);
        System.out.println("Balance:"+balance);
    }
}
class sav extends Account{
    void deposit(double cash){
        balance+=cash;
    }
    void withdrawl(double cash){
        if(balance-cash<min_balance && balance-cash>=0)
            System.out.println("Can't Withdraw! Min Balance Should be "+min_balance);
        else if(balance<cash)
            System.out.println("Not Enough Balance!");
        else
            balance-=cash;
    }
}
class curr extends Account{
    void deposit(double cash){
        balance+=cash;
    }
    void withdrawl(double cash){
        if(balance-cash<min_balance && balance-cash>=0)
            System.out.println("Can't Withdraw! Min Balance Should be "+min_balance);
        else if(balance<cash)
            System.out.println("Not Enough Balance!");
        else
            balance-=cash;
    }
}