
class Product {

    int id;
    String productName;
    int quantity;

    Product(int id, String productName, int quantity) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
    }

    void productStore(int q) {
        quantity += q;
        System.out.println(q + " added. New stock: " + quantity);
    }

    void productSubstract(int q) {
        if (q <= quantity) {
            quantity -= q;
            System.out.println(q + " removed. New stock: " + quantity);
        } else {
            System.out.println("Not enough stock!");
        }
    }

    void productDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 10);

        p1.productDetails();
        p1.productStore(5);
        p1.productSubstract(3);
        p1.productDetails();
    }
}
