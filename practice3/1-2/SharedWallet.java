public class SharedWallet {
    private static int money = 500;

    public static int getMoney() {
        return money;
    }

    public static void deposit(int amount) {
        if (amount < 0) {
            System.out.println("マイナスは入金できません");
            return;
        }
        money += amount;
    }
    public static void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("マイナスは出金できません");
            return;
        }
        if (amount > money) {
            System.out.println("残高超えての引き出しはできません");
            return;
        }
        money -= amount;
    }
}