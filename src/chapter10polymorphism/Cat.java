package chapter10polymorphism;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void scratch() {
        System.out.println("Scratch things");
    }
}
