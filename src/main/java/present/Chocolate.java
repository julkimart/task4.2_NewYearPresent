package present;

public class Chocolate extends Present {
    private String flavour;

    public Chocolate(String name, Double weight, Double price, String flavour) {
        super(name, weight, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Chocolate : [" + super.toString() + ", flavour = " + flavour + "]";
    }
}
