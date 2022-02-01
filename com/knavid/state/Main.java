package com.knavid.state;

public class Main {
    public static void main(String[] args) {
       BankAccount account = new BankAccount(); 
       account.printAccount();
       account.withdraw(100);
       account.deposit(200);
       account.block();
       account.withdraw(150);
       account.unblock();
       account.withdraw(150);

       account.printAccount();

    }
}
