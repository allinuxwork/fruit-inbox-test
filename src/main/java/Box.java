import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {

    private List<F> box = new ArrayList<>();

    public Box() {
    }

    public double getWeight() {
        double weight = 0.0f;
        for (F i : box) {
            weight += i.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> o) {
//        избегаем ошибки округления с помощью дельты
//        return Math.abs(this.getWeight() - o.getWeight()) < 0.0001;
        if (Math.abs(this.getWeight() - o.getWeight()) < 0.0001) {
            System.out.println("Вес фруктов равен");
            return true;
        }
        System.out.println("Вес фруктов  не равен");
        return false;
    }


    public boolean fillBox(Box<F> inBox) {
        // при попытке пересыпать коробки в саму себя, ничего не делать
        if (inBox == this) {
            System.out.println("В саму себя не пересыплю");
            return false;
        }

        inBox.box.addAll(box);
        box.clear();
        return true;
    }

    public void addFruit(F fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    @Override
    public String toString() {
//        return "Box{" +
//            "box=" + box + box.size() +
//            '}';
        return " - Общий вес Box " + box +
            " Kоличество - " + box.size();

    }
}
