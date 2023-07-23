public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("わんこ");
        animals[1] = new Cat("にゃんこ");
        animals[2] = new Dog("小太郎");

        for (Animal animal : animals) {
            animal.eat("食べ物");
            animal.sleep();
            animal.makeSound();

            if (animal instanceof Run) {
                ((Run)animal).run();
            }
            if (animal instanceof Swim) {
                ((Swim)animal).swim();
            }
        }
    }
}
