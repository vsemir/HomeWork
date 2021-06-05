package Lesson7;

import java.util.Scanner;

public class HomeWorkApp {
    public  static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat ("Barsik 1", 15, 15);
        catArray[1] = new Cat("Barsik 2", 10, 15);
        catArray[2] = new Cat("Barsik 3", 7, 7);
        catArray[3] = new Cat("Barsik 4", 20, 40);
        catArray[4] = new Cat("Barsik 5", 5, 20);

        Plate plate = new Plate();

        addEat();

        plate.info();

        eat(catArray, plate);

        plate.info();
    }

    public static void eat(Cat[] catArray, Plate plate){

        for (int i = 0; i < catArray.length; i++) {
            if (catArray[i].getAppetite() < Plate.getFood()){

                while ((Plate.getFood() - catArray[i].getAppetite()) >= 0 && catArray[i].getOvereating() > 0){

                    catArray[i].eat(plate);
                    catArray[i].setOvereating(catArray[i].getOvereating() - catArray[i].getAppetite());
                }
                if (catArray[i].getOvereating() <= 0){
                    catArray[i].setHunger(true);
                }
                catArray[i].info();
            }else {
                catArray[i].info();
                System.out.println("Мало еды в тарелке");
            }
            System.out.println();

        }
    }

    public static void addEat(){
        System.out.println("Добавить еду в тарелку?\n1:Да\n2:Нет");
        int a = in.nextInt();
        if (a == 1) {
            System.out.println("Сколько еды добавить?");
            int b = in.nextByte();
            Plate.setFood(Plate.getFood() + b);
            System.out.println("Еды в тарелке: " + Plate.getFood());
        }
    }


}
