package ecommerce;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(102, "Mouse", "Electronics"),
                new Product(101, "Keyboard", "Electronics"),
                new Product(105, "T-Shirt", "Clothing"),
                new Product(104, "Shoes", "Footwear"),
                new Product(103, "Monitor", "Electronics")
        };

        int searchId = 103;

        System.out.println("🔍 Linear Search:");
        Product result1 = LinearSearch.search(products, searchId);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n🔍 Binary Search:");
        Product result2 = BinarySearch.search(products, searchId);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
