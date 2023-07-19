package shopping;

public class Product {
    private String name;
    private int price;
    private static final double TAX_RATE = 0.10;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPriceWithTax() {
        return (int) Math.round(price * (1 + TAX_RATE));
    }
}
