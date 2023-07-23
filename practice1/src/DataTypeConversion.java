public class DataTypeConversion {
    public static void main(String[] args) {
        double num1  = 12.3 / 4;
        String age = "年齢：" + 20;

        System.out.println(num1);
        System.out.println(age);

        // キャスト演算子
        short num2 = 4321;
        byte  num3  = (byte)num2; // byte型に収まらず不正値になる
        System.out.println(num3);

        double num4 = 123.123;
        int    num5   = (int)num4; // 小数点以下を切り捨て
        System.out.println(num5);

        //インクリメント演算子
        int a = 100;
        a++;  //１増える
        System.out.println(a);
    }
}