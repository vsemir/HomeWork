package Lesson7;

public class Cat {

    private String name;
    private int appetite;
    private  int overeating;
    private  boolean hunger;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public  int getOvereating() {
        return overeating;
    }

    public  void setOvereating(int overeating) {
        this.overeating = overeating;
    }

    public  boolean isHunger() {
        return hunger;
    }

    public  void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public Cat(String name, int appetite, int overeating) {
        this.name = name;
        this.appetite = appetite;
        this.overeating = overeating;
        this.hunger = false;
    }

    public void eat(Plate p) {
            p.decreaseFood(appetite);

    }

    public void info (){
        System.out.println(name + ":\nСытость = " + hunger);
    }

}
