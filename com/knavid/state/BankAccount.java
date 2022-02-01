package com.knavid.state;

public class BankAccount {
    private final State blockState;
    private final State unblockState;
    private final State noMoneyState;
    private State state;
    private double balance = 0;

    public BankAccount() {
        this.blockState = new BlockState(this);
        this.unblockState = new UnblockState(this);
        this.noMoneyState = new NoMoneyState(this);
        this.state = unblockState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public State getBlockState() {
        return blockState;
    }

    public State getUnblockState() {
        return unblockState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    } 

    public void printAccount() {
        if(state instanceof BlockState) {
            System.out.println("The account is blocked");
        }
        System.out.println("Current balance is %.2f".formatted(balance));
    }

    public void withdraw(double amout) {
        state.withdraw(amout);
    }
    public void deposit(double amount) {
        state.deposit(amount);
    }
    public void block() {
        state.block();
    }
    public void unblock() {
        state.unblock();
    }
}
