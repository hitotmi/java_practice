public class Main {
    public static void main(String[] args) {
        Lambda addition = (a, b) -> a + b;
        Lambda subtraction = (a, b) -> a - b;

        // Lambda addition = new Lambda() {
        //     public int calculate(int a, int b) {
        //         return a + b;
        //     }
        // };

        // Lambda subtraction = new Lambda() {
        //     public int calculate(int a, int b) {
        //         return a - b;
        //     }
        // };

        System.out.println("10 + 5 = " + addition.calculate(10, 5));
        System.out.println("10 - 5 = " + subtraction.calculate(10, 5));
    }
}