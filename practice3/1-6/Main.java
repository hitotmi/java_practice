public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("田中", 30);
        Person person2 = new Person("田中", 25);
        System.out.println(person1);
        System.out.println(person1.equals(person2));
    }
}
