public class Main3 {
    public static void main(String[] args) {
        // コンストラクタ1を使ってCatクラスのインスタンスを生成
        Cat myCat1 = new Cat("NYAO", 3);
        myCat1.meow();

        // コンストラクタ2を使ってCatクラスのインスタンスを生成
        Cat myCat2 = new Cat("Tarou");
        myCat2.meow();

        // コンストラクタ3を使ってCatクラスのインスタンスを生成
        Cat myCat3 = new Cat();
        myCat3.meow();
    }
}