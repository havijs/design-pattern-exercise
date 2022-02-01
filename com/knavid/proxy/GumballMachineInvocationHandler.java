package com.knavid.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GumballMachineInvocationHandler implements InvocationHandler {
  private final GumballMachine gumballMachine;

  public GumballMachineInvocationHandler(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if(method.getName() == "setState") {
        State nextState = (State) args[0];
        System.out.println("Current state is %s".formatted(gumballMachine.getState().getClass().getName()));
        System.out.println("Next state is %s".formatted(nextState.getClass().getName()));
    }
    return method.invoke(gumballMachine, args);
  }
}
