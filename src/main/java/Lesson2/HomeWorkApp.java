package Lesson2;

import java.util.Scanner;

public class HomeWorkApp {
    public  static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Введите а:");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        sumAB(a,b);

        System.out.println("Задание 2");
        System.out.println("Введите x:");
        int x = in.nextInt();
        isPositiveOrNegative(x);

        System.out.println("Задание 3");
        System.out.println("Введите y:");
        int y = in.nextInt();
        System.out.println(isNegative(y));

        System.out.println("Задание 4");
        System.out.println("Введите текст:");
        String word = in.next();
        System.out.println("Введите количество повторений");
        int times = in.nextInt();
        printWordNTimes (word, times);

        System.out.println("Задание 5");

        System.out.println("Введите год");
        int age = in.nextInt();
        System.out.println(whatYearIsIt (age));

    }

    public static void sumAB(int a,int b) {
        boolean sum = 10 < a + b && a+b <= 20;
        System.out.println(sum);
        return;

    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }

    public static boolean isNegative(int y) {
        if (y < 0)
            return true;
        return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++){
            System.out.println(word);
        }
    }

    public static boolean whatYearIsIt (int age){

        if ((age%400 == 0 ^ !(age%100 == 0))  && age%4==0 && age > 0)
            return true;
        return false;
    }
}
