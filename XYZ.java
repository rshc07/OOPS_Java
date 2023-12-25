import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //five product info from the user where store in an array
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find Pid of the product with the highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println("\nProduct with the highest price has Pid: " + highestPricePid);

        // Calculate and display the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("\nTotal amount spent on all products: " + totalAmountSpent);

        scanner.close();
    }

    // Method to find Pid of the product with the highest price
    private static int findHighestPricePid(Product[] products) {
        int highestPricePid = -1;
        double highestPrice = Double.MIN_VALUE;

        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.getPid();
            }
        }

        return highestPricePid;
    }

    // Method to calculate and return the total amount spent on all products
    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.getPrice() * product.getQuantity();
        }

        return totalAmountSpent;
    }
}