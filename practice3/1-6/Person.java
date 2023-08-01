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

    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj instanceof Person) {
            Person p = (Person)obj;
            if (this.name.equals(p.name)) {
                return true;
            }
        }
        return false;
    }
}
