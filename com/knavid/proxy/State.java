package com.knavid.proxy;

public interface State {
  void insertQuarter();

  default void ejectQuarter() {
    System.out.println("There is no quarter in the machine!");
  }

  void turnCrank();

  void dispense();

  default void refill(int count) {
    throw new RuntimeException("The machine still has some gums!");
  }
}
