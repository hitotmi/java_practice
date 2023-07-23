import shopping.Product;

public class ShoppingDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 100);
        Product product2 = new Product("Banana", 200);

        int total = product1.getPrice() + product2.getPrice();
        int totalWithTax = product1.getPriceWithTax() + product2.getPriceWithTax();

        System.out.println("合計: " + total + " 税込み: " + totalWithTax);
    }
}