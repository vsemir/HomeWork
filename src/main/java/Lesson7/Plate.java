package Lesson7;

public class Plate {

    private static int food;

    public static int getFood() {
        return food;
    }

    public static void setFood(int food) {
        Plate.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public Plate(int food) {
        this.food = food;
    }

    public Plate() {
        this.food = 0;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
        System.out.println();
    }

}
