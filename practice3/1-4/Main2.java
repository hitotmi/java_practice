import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5以下の整数を入力してください: ");

        try {
            int number = scanner.nextInt();
            if (number > 5) {
                throw new RuntimeException("入力された数値が5より大きいです。");
            }
            System.out.println("入力された数値は: " + number);
        } catch (RuntimeException e) {
            System.out.println("エラー: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


// public class Main2 {
//     public static void main(String[] args) {
//         try {
//             checkNumber(5);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     static void checkNumber(int number) throws Exception {
//         if (number < 0) {
//             throw new Exception("数値が0未満です！");
//         } else {
//             System.out.println("数値は " + number + " です");
//         }
//     }
// }




// import java.util.InputMismatchException;
// import java.util.NoSuchElementException;
// import java.util.Scanner;

// public class Main2 {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             System.out.println("整数を入力してください: ");
//             int number = scanner.nextInt();
//             System.out.println("入力された数は: " + number);
//         } catch (InputMismatchException e) {
//             System.out.println("エラー: 整数を入力してください。");
//         } catch (NoSuchElementException e) {
//             System.out.println("エラー: 入力がありません。");
//         } catch (IllegalStateException e) {
//             System.out.println("エラー: Scannerが閉じています。");
//         }
//     }
// }
