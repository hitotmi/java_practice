public class Cat {
    String name;
    int age;

    // コンストラクタ1 - 名前と年齢を引数
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // コンストラクタ2 - 名前のみを引数
    public Cat(String name) {
        this(name, 0);
    }

    // コンストラクタ3 - 引数なし
    public Cat() {
        this("Unknown", 0);
    }

    public void meow() {
        System.out.println(name + "はニャーと言う");
    }
}