import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Panigale SuperleggeraV4 ", "Ducati Corse", 22.295,
                "Plexiglas screen, nose fairing and larger lateral fairings"));
        productList.add(new Product(2, "YZF-R1", "yamaha", 17.399,
                "Fuel injection with YCC-T and YCC-I"));

        Product product1 =  productManagement.addProduct();
        productList.add(product1);

        productManagement.writeFileObject(productList);
        List<Product> productList1 = productManagement.readFileObject(productList);
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList1);
        }

    }
}
