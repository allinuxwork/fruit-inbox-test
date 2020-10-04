public abstract class Fruit {
    private double weight;
    private int amount;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
            "weight=" + weight +
            '}';
    }
}
