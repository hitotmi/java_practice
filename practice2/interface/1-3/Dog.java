public class Dog extends Animal implements Run, Swim {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + "は吠えています");
    }

    public void run() {
        System.out.println(name + "は走っています");
    }

    public void swim() {
        System.out.println(name + "は泳いでいます");
    }
}