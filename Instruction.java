public class Instruction {
    public static void main(String[] args) {
        System.out.print("購入する商品の名前を入力してください: ");

        String item  = new java.util.Scanner(System.in).nextLine();

        System.out.print("購入する" + item + "の数量を入力してください: ");

        String quantityStr = new java.util.Scanner(System.in).nextLine();
        int quantity = Integer.parseInt(quantityStr);

        System.out.println(item + "を" + quantity + "個購入する");

        int price = new java.util.Random().nextInt(901) + 100;
        int totalPrice = price * quantity;

        System.out.println(item+"の単価は"+price+"円です");
        System.out.println("お会計は"+totalPrice+"円です");
    }
}
