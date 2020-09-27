package model;

public class Product {
    private int iD;
    private String Name;
    private long price;

    public Product() {
    }

    public Product(int iD, String name, long price) {
        this.iD = iD;
        Name = name;
        this.price = price;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iD=" + iD +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}
