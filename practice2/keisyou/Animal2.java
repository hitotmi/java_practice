// 抽象クラス
abstract public class Animal2 {
    protected String name;

    public Animal2(String name) {
        this.name = name;
    }

    // 抽象メソッド
    public abstract void eat(String food);

    // public void eat(String food) {
    //     System.out.println(name + "は" + food + "を食べている");
    // }

    public void sleep() {
        System.out.println(name + "は寝ている");
    }
}