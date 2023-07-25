public class Main {
    public static void main(String[] args) {
        System.out.println("初期残高: " + SharedWallet.money);

        SharedWallet.money += 3000;
        System.out.println("入金後の残高: " + SharedWallet.money);

        SharedWallet.money -= 500;
        System.out.println("出金後の残高: " + SharedWallet.money);
    }
}