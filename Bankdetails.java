package org.example;
import java.util.*;
class BAnkAccount{
    String accountHolder;
    double balance;
    //use constructor
    BAnkAccount(String accountHolder,double balance){
       this.accountHolder=accountHolder;
       this.balance=balance;
    }
    void depositAmount(int a)
    {
        balance+=a;
System.out.println("Deposited amount"+a);
        System.out.println("Total amount"+balance);
    }
    void withdrawAmount(int b)
    {
        balance-=b;
        System.out.println("withdrawal amount"+b);
        System.out.println("Total amount"+balance);
    }
    void printDetails()
    {
        System.out.println("Bank details");
        System.out.println("AccountHolder"+accountHolder);
        System.out.println("Bank balance"+balance);

    }
        }


public class Oops {
    public static void main(String Args[]) {
BAnkAccount b=new BAnkAccount("IF",1000);
b.depositAmount(10);
   b.withdrawAmount(2000);
        b.printDetails();

    }
}


