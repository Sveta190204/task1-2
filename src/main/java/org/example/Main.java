package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в массиве: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов в массиве: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Введите число для проверки условия: ");
        int conditionalNumber= scanner.nextInt();

        int count = 0;
        System.out.println("Положение неположительных элементов, модуль разности индексов которых, меньше " + conditionalNumber + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] <= 0) {
                    for (int k = 0; k < rows; k++) {
                        for (int l = 0; l < cols; l++) {
                            if (Math.abs(i - k) + Math.abs(j - l) < conditionalNumber && array[k][l] <= 0) {
                                System.out.println("Элемент: " + array[i][j] + " Строка: " + i + " Столбец: " + j);
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Общее количество таких элементов: " + count);
    }
}