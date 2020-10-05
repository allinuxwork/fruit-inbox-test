public class Orange extends Fruit {
    private final double weight;

    public Orange(double weight) {
        super(weight);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Orange - " + weight;
    }
}
