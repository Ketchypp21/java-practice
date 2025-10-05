package farm;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }

    @Override

    public void eat() {
        System.out.println("dog food");
    }
}
