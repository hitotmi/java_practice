public class Main7 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = -100;
        int num3 = 30;
        double num4 = 1.4;
        double num5 = 1.7;
        double num6 = 4.0;
        double num7 = -4.0;
        double num8 = 64;


        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));
        System.out.println(Math.max(num1,num3));
        System.out.println(Math.min(num1,num3));
        System.out.println(Math.ceil(num4)); //切り上げ
        System.out.println(Math.ceil(num5)); //切り上げ
        System.out.println(Math.floor(num4)); //切り捨て
        System.out.println(Math.floor(num5));  //切り捨て
        System.out.println(Math.round(num4)); //四捨五入
        System.out.println(Math.round(num5)); //四捨五入
        System.out.println(Math.pow(num6,2)); //累乗
        System.out.println(Math.pow(num6,3));
        System.out.println(Math.pow(num7,2));
        System.out.println(Math.pow(num7,3));
        System.out.println(Math.sqrt(num6));  //平方根
        System.out.println(Math.sqrt(num7));  //平方根
        System.out.println(Math.cbrt(num8));  //立方根

        for (int i = 0 ; i < 5; i++) {
            System.out.println(Math.round(Math.random() * 5));
        }
    }
}