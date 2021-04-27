import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Panigale SuperleggeraV4 ", "Ducati Corse", 22.295,
                "Plexiglas screen, nose fairing and larger lateral fairings"));
        productList.add(new Product(2, "YZF-R1", "yamaha", 17.399,
                "Fuel injection with YCC-T and YCC-I"));

//        System.out.println("Enter source: ");
//        String source = sc.nextLine();
        File fileSource = new File("C:\\Users\\hieu\\Java project\\17. IO Binary File & Serialization\\[Optional] Copy file nhi phan\\Source.txt");
//        System.out.println("Enter direction: ");
//        String direction = sc.nextLine();
        File fileDirection = new File("C:\\Users\\hieu\\Java project\\17. IO Binary File & Serialization\\[Optional] Copy file nhi phan\\Director.txt");

        writeFile(productList, fileSource);
        List<Product> productList1 = readFile(productList, fileDirection);
        try {
            writeFile(productList, fileDirection);

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("File nhị phân: ");
        for (Product pr : productList1) {
            System.out.println(pr);
        }
    }


    // Viết file
    public static void writeFile(List<Product> productList, File file) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(productList);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Đọc file
    public static List<Product> readFile(List<Product> productList, File file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            productList = (List<Product>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}
