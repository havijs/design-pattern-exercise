package com.knavid.proxy;

import java.util.Random;

public class HasQuarterState implements State {
  private final GumballMachine gumballMachine;

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("There is already a quarter in the machine!");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Here is your quarter!");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    int randomNumber = new Random(10).nextInt();
    if(randomNumber == 0) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }

  @Override
  public void dispense() {
    System.out.println("Please turn the crank first!");
  }
}
