package org.ksk.java8;

/**
 * @<code> public class Main implements InterfaceA, InterfaceB {
 * </code>
 * To overcome above problem refer below code
 * @see InterfaceA and {@link InterfaceB} is also having the same default methods.
 * So if you are trying to implement both Interfaces. you will get error
 */


public class MainDefaultInterface implements InterfaceB, InterfaceA {

    @Override
    public void printSomething() {
        //Option 1 -> Provide our own implementation.
        System.out.println("I am inside Main class");
        //Option 2 -> Use existing implementation from interfaceA or interfaceB or both.
        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }

    public static void main(String args[]) {
        MainDefaultInterface main = new MainDefaultInterface();
        main.printSomething();
    }
}
