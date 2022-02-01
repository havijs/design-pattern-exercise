package com.knavid.proxy;

public class NoQuarterState implements State {
  private final GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You inserted a quarter!");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("You should first put a quarter!");
  }

  @Override
  public void dispense() {
    System.out.println("First put a quarter and turn the crank!");
  }
}
