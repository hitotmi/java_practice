public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("わんこ");
        dog.eat("ドッグフード");
        dog.sleep();
        dog.makeSound();
        if (dog instanceof Dog) {
            ((Dog)dog).run();
            ((Dog)dog).swim();
        }

        Animal cat = new Cat("にゃんこ");
        cat.eat("キャットフード");
        cat.sleep();
        cat.makeSound();
        if (cat instanceof Cat) {
            ((Cat)cat).run();
        }
    }
}
