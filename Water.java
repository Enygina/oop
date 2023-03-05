public class Water extends Product {
    private String carbonated;

    public Water (String name, Double price) {
        super(name, price);
        this.carbonated = "yes";
    }

    public Water (String name, Double price, String carbonated) {
        this(name, price);
        this.carbonated = carbonated;
    }

    public String toString() {
        return String.format("%s carbonated = %s  ", super.toString(), this.carbonated);
    }
}