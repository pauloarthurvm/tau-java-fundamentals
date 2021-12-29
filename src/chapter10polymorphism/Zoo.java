package chapter10polymorphism;

public class Zoo {

    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.fetch();
//        dog.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();
        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Give dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Give cat food");
        }
    }
}
