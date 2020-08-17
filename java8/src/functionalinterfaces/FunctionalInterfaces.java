package functionalinterfaces;

/**
 * An interface that has a single abstract method is called a functional interface.
 * While an interface can have one or more default methods, it should have only one abstract method to be called a functional interface.
 * Some of the functional interfaces defined in Java 8 are Predicate, Consumer, Supplier, Function, etc.
 *
 * @apiNote This is not mandatory but if an interface is annotated with @FunctionalInterface annotation and
 * someone tries to add another abstract method to the,
 * the compiler will throw an error. Below is an example of a functional interface.
 */
@FunctionalInterface
public interface FunctionalInterfaces {
    void doSomething();

//    default void foo() {  // If you add this compiler will throw an exception
//        System.out.println("foo");
//    }

}
