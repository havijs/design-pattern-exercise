package com.knavid.state;

public class UnblockState implements State {
    private final BankAccount bankAccount;

    public UnblockState(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void withdraw(double amount) {
        if(amount == bankAccount.getBalance()) {
            bankAccount.setBalance(0);
            bankAccount.setState(bankAccount.getNoMoneyState());
        } else if(amount < bankAccount.getBalance()) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
        } else {
            System.out.println("You don't have enough money");
        }
    }
    public void deposit(double amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
    }
    public void block() {
        bankAccount.setState(bankAccount.getBlockState());
    }
    public void unblock() {
        System.out.println("The account is already unblocked.");
    }
}
