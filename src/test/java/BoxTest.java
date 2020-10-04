
import org.junit.Assert;
import org.junit.Test;

public class BoxTest {

    @Test
    public void checkBox() {
        Box<Fruit> fruitBox = new Box<>();
        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        System.out.println("------------------------------------");
        System.out.println("Добавляем фрукты в коробки:");
        orange.addFruit(new Orange(1.5f), 20);
        orange1.addFruit(new Orange(1.5f), 10);
        apple.addFruit(new Apple(1.0f), 25);
        System.out.println("Коробка c апельсинами: " + orange.getWeight() + orange.toString());
        System.out.println("Коробка c яблоками: " + apple.getWeight() + apple.toString());
        System.out.println("------------------------------------");

        System.out.println("------------------------------------");
        System.out.println("Сравниваем коробку с яблоками и коробку с апельсинами");
//        System.out.println(apple.compare(orange));


        Assert.assertFalse(apple.compare(orange));
        System.out.println("------------------------------------");


        System.out.println("------------------------------------");
        System.out.println("Общая корзина для Апельсинов и яблок");
        fruitBox.addFruit(new Orange(1.5f), 20);
        fruitBox.addFruit(new Apple(1.0f), 20);
        System.out.println(fruitBox.getWeight());
        System.out.println("------------------------------------");

        System.out.println("------------------------------------");
        System.out.println("Пересыпаем апельсины");
        orange.fillBox(orange1);
        System.out.println("Коробка  c апельсинами orange высыпали: " + orange.getWeight() + orange.toString());
        System.out.println("Коробка c апельсинами orange1 наполнили: " + orange1.getWeight() + orange1.toString());

        System.out.println("------------------------------------");
        System.out.println("Пересыпаем апельсины в апельсины и яблоки в яблоки");
        orange.fillBox(orange);
        apple.fillBox(apple);
        System.out.println("Коробка  c апельсинами orange высыпали: " + orange.getWeight() + orange.toString());
        System.out.println("Коробка c апельсинами orange1 наполнили: " + orange1.getWeight() + orange1.toString());

        System.out.println("------------------------------------");
        System.out.println("яблоки в апельсины и апельсины в яблоки ошибка");
//        apple.fillBox(orange);
//        orange.fillBox(apple);

    }
}