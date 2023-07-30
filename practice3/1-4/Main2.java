import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("整数を入力してください: ");
            int number = scanner.nextInt();
            System.out.println("入力された数は: " + number);
        } catch (InputMismatchException e) {
            System.out.println("エラー: 整数を入力してください。");
        } catch (NoSuchElementException e) {
            System.out.println("エラー: 入力がありません。");
        } catch (IllegalStateException e) {
            System.out.println("エラー: Scannerが閉じています。");
        }
    }
}
