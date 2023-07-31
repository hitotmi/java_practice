import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("じゃんけんの手を入力しましょう");
        System.out.println("グー、チョキ、パーのいずれかを入力しましょう");

        Scanner scanner = new Scanner(System.in);
        String userHand = scanner.next();

        Jyanken jyanken = new Jyanken();
        String result = jyanken.play(userHand);

        System.out.println(result);
    }
}