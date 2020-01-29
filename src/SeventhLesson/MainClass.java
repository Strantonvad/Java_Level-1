package SeventhLesson;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 25);
        cats[1] = new Cat("Murzik", 15);
        cats[2] = new Cat("Vaska", 30);
        cats[3] = new Cat("Pushok", 55);
        cats[4] = new Cat("Bandit", 10);

        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < cats.length ; i++) {
            cats[i].eat(plate);
            System.out.println("Наелся ли кот: " + cats[i].isSatiety());
        }
        plate.info();

        plate.addFood(10);
        plate.info();
    }
}
