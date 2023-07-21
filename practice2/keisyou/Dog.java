public class Dog extends Animal2 {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + "は吠えている");
    }

    public void eat(String food) {
        System.out.println(name + "はむしゃむしゃしている");
        super.eat(food);
    }
}