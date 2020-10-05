public class Apple extends Fruit {
    private final double weight;

    public Apple(double weight) {
        super(weight);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple - " + weight;
    }

}
