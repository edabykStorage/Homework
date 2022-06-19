package lesson3;

import java.util.*;

public class ArrayHw2D {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen tek bir sayı giriniz:");
        int num = inp.nextInt();

        System.out.println("Lütfen satır boyutu giriniz:");
        int row = inp.nextInt();

        System.out.println("Lütfen sütun boyutu giriniz:");
        int column = inp.nextInt();

        int array[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    array[i][j] = (num + 1) / 2;
                } else if (i > j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = num;
                }
            }
        }

        for (int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[i].length; ++j) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
}
