// DogクラスはAnimalBehaviorインターフェースを実装
public class Dog2 implements AnimalBehavior {
    private String name;

    public Dog2(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(name + "はむしゃむしゃ" + food + "を食べている");
    }

    public void sleep() {
        System.out.println(name + "は寝ている");
    }

    public void bark() {
        System.out.println(name + "は吠えている");
    }
}