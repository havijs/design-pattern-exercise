package com.knavid.proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
       GumballMachine gumballMachine = new GumballMachineImpl(0);
       GumballMachine proxy = createPersonProxy(gumballMachine);

       proxy.setState(gumballMachine.getWinnerState());
    }

    private static GumballMachine createPersonProxy(GumballMachine gumballMachine) {
        return (GumballMachine) Proxy.newProxyInstance(
            gumballMachine.getClass().getClassLoader(),
            gumballMachine.getClass().getInterfaces(),
            new GumballMachineInvocationHandler(gumballMachine));
  }
}
