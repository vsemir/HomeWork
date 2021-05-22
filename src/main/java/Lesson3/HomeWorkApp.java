package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static Scanner in = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        invertArray();

        System.out.println("Задание 2: ");
        fillArray();

        System.out.println("Задание 3: ");
        changeArray();

        System.out.println("Задание 4: ");
        fillDiagonal();

        System.out.println("Задание 5: ");
        System.out.println("Введите длину массива: ");
        int y = in.nextInt();
        System.out.println("Введите значение элиментов: ");
        int x = in.nextInt();
        myArray(y, x);

        System.out.println("Задание 6: ");
        System.out.println("Введите длину массива: ");
        int len = in.nextInt();
        maxValue(len);

        System.out.println("Задание 7: ");
        sumArray();

        System.out.println("Задание 8: ");
        System.out.println("Дан одномерный массив: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
        System.out.println("Введите число итераций сдвига");
        int n = in.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shiftArray(arr,n);
    }
    public static void invertArray(){
        int[] arr = {0,1,1,0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal(){
        int[][] arr = new int[6][6];
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++ ) {
            arr[i][i] = 1;
            arr[i][arr.length-1-i] = 1;
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(arr[i]));
    }

    public static void myArray (int len, int initialValue) {
        int[] arr = new int [len];
        for (int i=0; i< arr.length; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void maxValue (int len){
        int[] mArr = new int[len];
        int max = 0;
        int min = len;
        for (int i =0; i< mArr.length; i++){
            mArr[i] = random.nextInt(len);

            if (max < mArr[i])
                max = mArr[i];
            if (min > mArr[i])
                min = mArr[i];
        }
        System.out.println(Arrays.toString(mArr));
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
    }

    public static void sumArray() {
        int[] arr = {1, 2, 3, 3, 2, 1};
        int sum1 = 0;
        int sum2 = 0;
        boolean sum = true;
        for (int i=0; i < arr.length; i++){
            if (i < arr.length/2){
                sum1 += arr[i];
            }
            else {
                sum2 += arr[i];
            }
            sum = sum1 == sum2;
        }
        System.out.println(sum1 + " " + sum2 + " " + sum);
    }

    public static void shiftArray(int[] arr, int p) {
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < Math.abs(p); j++) {
            if (p>0) {
                int temp = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = temp;
            } else{
                int temp = 0;
                temp = arr[arr.length - 1];
                for (int i = arr.length-1; i > 0 ; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
