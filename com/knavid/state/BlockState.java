package com.knavid.state;

public class BlockState implements State {
    private final BankAccount bankAccount;

    public BlockState(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void withdraw(double amout) {
        System.out.println("The account is blocked.");
    }
    public void deposit(double amount) {
        System.out.println("The account is blocked.");
    }
    public void block() {
        System.out.println("The account is already blocked.");
    }
    public void unblock() {
        bankAccount.setState(bankAccount.getUnblockState());
    }
}
