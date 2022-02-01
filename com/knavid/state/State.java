package com.knavid.state;

public interface State {
    void withdraw(double amout);
    void deposit(double amount);
    void block();
    void unblock();
}
