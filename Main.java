public class Main {
    public static void main(String[] args) {
        // 整数型の変数
        int num = 123;

        // 浮動小数点型の変数
        double num1 = 0.123;

        // 文字列型・文字型の変数
        String string_test = "田中一郎";

        System.out.println(num);
        System.out.println(num1);
        System.out.println(string_test);

        num = 111;
        System.out.println(num);

        int num2 = 11;
        float num3 = 2.1F;
        System.out.println(num2 + num3);

        String lastName  = "中田";
        String firstName = "次郎";
        System.out.println(lastName + firstName);

        // final変数
        final double PI = 3.14159;
        int radius = 3;

        double circleArea = PI * radius * radius;
        System.out.println(circleArea);

        // 変数PIを5に設定。finalが指定された変数の値は変更できないためエラーになる。
        // PI = 5;
        // circleArea = PI * radius * radius;
        // System.out.println(circleArea);
    }
}
