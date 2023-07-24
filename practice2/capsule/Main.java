public class Main {
    public static void main(String[] args) {
        Person tanaka = new Person("田中", 30, "東京");
        tanaka.setAge(31);
        tanaka.setAddress("大阪");

        System.out.println("名前は " + tanaka.getName());
        System.out.println("年齢は " + tanaka.getAge());
        System.out.println("住所は " + tanaka.getAddress());
    }
}