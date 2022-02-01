package com.knavid.proxy;

public class GumballMachineImpl implements GumballMachine {
  private final State noQuarterState;
  private final State hasQuarterState;
  private final State soldState;
  private final State soldOutState;
  private final State winnerState;
  private State state;
  private int count = 0;

  public GumballMachineImpl(int count) {
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    soldOutState = new SoldOutState(this);
    winnerState = new WinnerState(this);
    if(count > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }

    this.count = count;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void releaseBall() {
    System.out.println("Here is your gumball!");
    if(count > 0) {
      count--;
    }
  }

  public State getWinnerState() {
    return winnerState;
  }

}
