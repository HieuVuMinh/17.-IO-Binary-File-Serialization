import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oss = null;
        try {
            oss = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(1, "IPhone 12", 2800000, "New");
            oss.writeObject(product);
            oss.flush();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            oss.close();
        }
        System.out.println("Success!");

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("product.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        }catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
