package com.knavid.state;

public class NoMoneyState implements State {
    private final BankAccount bankAccount;

    public NoMoneyState(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void withdraw(double amout) {
        System.out.println("The account balance is 0");
    }
    public void deposit(double amount) {
        if(amount > 0) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            bankAccount.setState(bankAccount.getUnblockState());
        }
    }
    public void block() {
        bankAccount.setState(bankAccount.getBlockState());
    }
    public void unblock() {
        System.out.println("The account is already unblocked.");
    }
}

