public class Method3 {
    public static void main(String[] args) {
        introduce();

        double triangleArea = calcTriangleArea(3.0, 3.0);
        System.out.println("三角形の面積は" + triangleArea + "㎠です。");

        double circleArea = calcCircleArea(3.0);
        System.out.println("円の面積は" + circleArea + "㎠です。");
    }

    public static void introduce(){
        String name = "坂本";
        int age = 20;
        double height = 180.5;
        System.out.println(name + age + "歳。身長は" + height + "センチです。");
    }

    public static double calcTriangleArea(double bottom, double height){
        double area = bottom * height / 2;
        return area;
    }

    public static double calcCircleArea(double radius){
        double area = radius * radius * 3.14;
        return area;
    }
}