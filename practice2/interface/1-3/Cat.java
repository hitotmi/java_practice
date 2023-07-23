public class Cat extends Animal implements Run {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + "はニャーと鳴いています");
    }

    public void run() {
        System.out.println(name + "は走っています");
    }
}