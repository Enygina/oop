public class Chokolate extends Product {
    private String chocoKind;

    public Chokolate (String name, Double price) {
        super(name, price);
        this.chocoKind = "dark";
    }

    public Chokolate (String name, Double price, String chocoKind) {
        this(name, price);
        this.chocoKind = chocoKind;
    }

    public String toString() {
        return String.format("%s chocokind = %s  ", super.toString(), this.chocoKind);
    }
}
