import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idProduct;
    private String nameProduct;
    private String producer;
    private double price;
    private String description;

    public Product(){}

    public Product(int idProduct, String nameProduct, String producer, double price, String description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
        this.description = description;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product " +
                "idProduct: " + idProduct +
                ", nameProduct: '" + nameProduct + '\'' +
                ", producer: '" + producer + '\'' +
                ", price: " + price +
                ", description: '" + description + '\'';
    }
}
