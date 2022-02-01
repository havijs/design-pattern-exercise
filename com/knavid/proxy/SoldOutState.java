package com.knavid.proxy;

public class SoldOutState implements State {
  private final GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("There is no gum in the machine!");
  }

  @Override
  public void turnCrank() {
    System.out.println("There is no gum in the machine!");
  }

  @Override
  public void dispense() {
    System.out.println("There is no gum in the machine!");
  }

  @Override
  public void refill(int count) {
    State.super.refill(count);
    gumballMachine.setCount(count);
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
}
