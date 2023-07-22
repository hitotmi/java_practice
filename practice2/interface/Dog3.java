public class Dog3 implements Run, Swim {
    private String name;

    public Dog3(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(name + "は" + food + "を食べています");
    }

    public void sleep() {
        System.out.println(name + "は寝ています");
    }

    public void run() {
        System.out.println(name + "は走っています");
    }

    public void swim() {
        System.out.println(name + "は泳いでいます");
    }

    public void bark() {
        System.out.println(name + "は吠えています");
    }
}
