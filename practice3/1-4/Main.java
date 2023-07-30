import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("整数を入力してください: ");
            int number = scanner.nextInt();
            System.out.println("入力した数の平方根は: " + Math.sqrt(number));
        } catch (InputMismatchException e) {
            System.out.println("エラー: 整数を入力してください。");
        } finally {
            if (scanner != null) {
                System.out.println("処理終了します");
                scanner.close();
            }
        }
    }
}
