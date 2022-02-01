package com.knavid.proxy;

public class WinnerState implements State{

  private final GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {

    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("A gum has just been sold. Wait a second!");
  }

  @Override
  public void turnCrank() {
    System.out.println("A gum has just been sold. Wait a second!");
  }

  @Override
  public void dispense() {
    if(gumballMachine.getCount() > 0) {
      gumballMachine.releaseBall();
      if (gumballMachine.getCount() > 0) {
        gumballMachine.releaseBall();
      } else {
        System.out.println("Unfortunately we ran out of gums :(");
      }
    }

    if(gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }
}
