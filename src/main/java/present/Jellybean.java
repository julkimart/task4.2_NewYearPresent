package present;

public class Jellybean extends Present {
    private String brand;

    public Jellybean() {}

    public Jellybean(String name, Double weight, Double price, String brand) {
        super(name, weight, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "jellybean : [" + super.toString() + ", brand = " + brand + "]";
    }
}
