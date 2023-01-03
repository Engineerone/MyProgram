package com.guryanov;

public class Array4 {
    public static void main(String[] args) {

        int[] array = {3, 5, 6, 8, 7, 9,10,66};
        double sum = 0;

        for (int elem : array) {
            sum += elem;
        }
        System.out.println("Результат: "+sum/array.length);
    }
}
