package com.homework10;


public class Main {

    static void task1() {
        int[][] array = {
                {12, -7, 48, 3, -21},
                {23, -5, -65, 43, 0, 11},
                {77, -1, 32},
                {-11, 543, 9, -71},
                {129, -12, 45, 76, -78, 87, -90}
        };

        for (int i = 0; i < 1; ++i) {
            for (int j = array[i].length - 1; j < array[i].length; ++j) {
                System.out.println("Элемент, расположенный в правом верхнем углу массива: " + array[i][j]);
            }
        }
        for (int i = array.length - 1; i < array.length; ++i) {
            for (int j = 0; j < 1; ++j) {
                System.out.println("Элемент, расположенный в левом нижнем углу массива: " + array[i][j]);
            }
        }
    }

    static void task2() {
        int[][] array = {
                {12, -7, 48, 3, -21},
                {23, -5, -65, 43, 0, 11},
                {77, -1, 32},
                {-11, 543, 9, -71},
                {129, -12, 45, 76, -78, 87, -90}
        };

        System.out.println("Элементы второго столбца массива: ");
        for (int i = 0; i < array.length; ++i) {
            for (int j = 1; j < 2; ++j) {
                System.out.print(array[i][j] + ", ");
            }
        }

        System.out.println();
        System.out.println("Элементы пятой строки массива: ");
        for (int i = 4; i < 5; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + ", ");
            }
        }
    }

    static void task3() {
        int[][] array = {
                {12, -7, 48, 3, -21},
                {23, -5, -65, 43, 0, 11},
                {77, -1, 32},
                {-11, 543, 9, -71},
                {129, -12, 45, 76, -78, 87, -90}
        };

        int MaxSumOfElements = 0;
        int indexMaxSumOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            int sumOfElements = 0;
            for (int j = 0; j < array[i].length; ++j) {
                sumOfElements += array[i][j];
            }
            if (MaxSumOfElements < sumOfElements) {
                MaxSumOfElements = sumOfElements;
                indexMaxSumOfElements = i;

            }
        }
        System.out.println();
        System.out.println("Строка, сумма элементов которой максимальна: ");
        for (int i = 0; i < array[indexMaxSumOfElements].length; i++) {
            System.out.print(array[indexMaxSumOfElements][i] + ", ");
        }
        System.out.println();
    }

    static void sumOfElementsArray(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: " + sum);
    }

    static void task4() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + " ");
            }
        }

        sumOfElementsArray(array);
    }



    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
       
    }
}
