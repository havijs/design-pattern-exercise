package com.knavid.proxy;

public interface GumballMachine {
  State getNoQuarterState();
  State getHasQuarterState();
  State getState();
  void setState(State state);
  State getSoldState();
  State getSoldOutState();
  int getCount();
  void setCount(int count);
  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void releaseBall();
  State getWinnerState();
}
