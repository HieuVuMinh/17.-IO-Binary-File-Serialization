import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    Scanner sc = new Scanner(System.in);
    private int idProduct;
    private String nameProduct;
    private String producer;
    private double price;
    private String description;

    public ProductManagement() {
    }

    // Phương thức nhập đối tượng
    public Product addProduct() {

        System.out.println("Enter ID product: ");
        idProduct = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name product: ");
        nameProduct = sc.nextLine();
        System.out.println("Enter producer: ");
        producer = sc.nextLine();
        System.out.println("Enter price: ");
        price = sc.nextDouble();
        System.out.println("Enter description: ");
        description = sc.nextLine();
        Product product = new Product(idProduct, nameProduct, producer, price, description);
        return product;
    }

    // Phương thức viết vào file object
    public void writeFileObject(List<Product> productList) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MotorProduct.txt"));
            oos.writeObject(productList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức đọc file object
    public List<Product> readFileObject(List<Product> productList) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MotorProduct.txt"));
            productList = (List<Product>) ois.readObject();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
