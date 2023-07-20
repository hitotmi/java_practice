public class Person {
    // has-a関係
    Name name;

    public Person(Name name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("フルネーム:" + this.name.getFullName());
    }
}