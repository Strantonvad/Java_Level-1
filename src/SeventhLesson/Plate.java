package SeventhLesson;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if ((food - n) < 0) food = 0;
        else food -= n;
    }

    public void addFood(int f) {
        food += f;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
}
