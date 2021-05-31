package Lesson6;

public abstract class Animals {

    private String name;
    private static int count;

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animals(String name) {
        this.name = name;
    }
}
