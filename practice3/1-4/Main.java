public class Main {
    public static void main(String[] args) {
        String notANumber = "数字じゃない(notNumber)";

        try {
            int number = Integer.parseInt(notANumber);
        } catch (NumberFormatException e) {
            System.out.println(notANumber + "は整数ではありません。");
        }

        try {
            int[] array = new int[5];
            int number = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("ArrayIndexOutOfBoundsExceptionが発生しました: " + e.getMessage());
        }
        System.out.println("処理終了です");
    }
}
