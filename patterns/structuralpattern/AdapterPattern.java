/*
 * package structuralpattern;
 * 
 * The adapter design pattern is a structural design pattern that allows two
 * unrelated/uncommon interfaces to work together. In other words, the adapter
 * pattern makes two incompatible interfaces compatible without changing their
 * existing code.
 * 
 * class BirdAdapter implements ToyDuck { // You need to implement the interface
 * your // client expects to use. Bird bird;
 * 
 * public BirdAdapter(Bird bird) { // we need reference to the object we // are
 * adapting this.bird = bird; }
 * 
 * public void squeak() { // translate the methods appropriately
 * bird.makeSound(); } }
 * 
 * public class AdapterPattern {
 * 
 * public static void main(String[] args) {
 * 
 * Sparrow sparrow = new Sparrow(); ToyDuck toyDuck = new PlasticToyDuck();
 * 
 * // Wrap a bird in a birdAdapter so that it // behaves like toy duck ToyDuck
 * birdAdapter = new BirdAdapter(sparrow);
 * 
 * System.out.println("Sparrow..."); sparrow.fly(); sparrow.makeSound();
 * 
 * System.out.println("ToyDuck..."); toyDuck.squeak();
 * 
 * // toy duck behaving like a bird System.out.println("BirdAdapter...");
 * birdAdapter.squeak(); } }
 */