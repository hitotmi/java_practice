public class Person {
    private String name;
    private int age;

    // コンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // オーバーライド
    public String toString() {
        return "Person[name=" + this.name + ", age=" + this.age + "]";
    }
}
