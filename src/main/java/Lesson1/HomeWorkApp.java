package Lesson1;

import java.util.Scanner;

public class HomeWorkApp {
    public  static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        System.out.println("Введите а:");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        int c = a+b;
        if (c>=0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor()  {
        System.out.println("Ведите значение:");
        int value = in.nextInt();
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Желтый");
        else if (value > 100) System.out.println("Зеленый");
    }

    public static void  compareNumbers() {
        System.out.println("Введите а:");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

}
