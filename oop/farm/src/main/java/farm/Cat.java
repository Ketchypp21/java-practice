package farm;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("cat food");
    }
}
