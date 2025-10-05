package farm;

public abstract class Animal {
    public abstract void makeSound();

    private String name;
    private int age;

    public void eat(){
        System.out.println("eating");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }
}
