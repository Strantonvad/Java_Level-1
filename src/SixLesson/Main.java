package SixLesson;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(500f, 0.5f, 10f);
        Animal cat = new Cat(200f, 2f, 0);
        System.out.println(dog.run(550f));
        System.out.println(dog.jump(0.3f));
        System.out.println(dog.swim(9f));

        System.out.println(cat.run(300f));
        System.out.println(cat.jump(1f));
        System.out.println(cat.swim(100f));
    }
}
