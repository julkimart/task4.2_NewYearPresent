package present;

public abstract class Present {
    private String name;
    private Double weight;
    private Double price;

    public Present() {}

    public Present(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + ", weight = " + weight + ", price = " + price;
    }

    public static double summary(double... values) {
        double summary = 0.0;
        for (double v : values) {
            summary += v;
        }
        return summary;
    }

}
