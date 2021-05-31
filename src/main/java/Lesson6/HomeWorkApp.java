package Lesson6;

public class HomeWorkApp {

    public static void main(String[] args) {
        Cat c1 = new Cat("Барсик");
        Dog d1 = new Dog("Бобик");
        Cat c2 = new Cat("Симба");
        Dog d2 = new Dog("Шарик");
        Cat c3 = new Cat("Гав");
        Dog d3 = new Dog("Тузик");

        c1.run(150);
        c1.swim(20);
        d1.run(280);
        d1.swim(20);
        c1.catInfo();
        d1.dogInfo();
        c2.catInfo();
        d2.dogInfo();
        c3.catInfo();
        d3.dogInfo();

    }
}
