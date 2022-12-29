package com.guryanov;
public class Array2 {
    public static void main(String[] args) {
        float Array[] = {1.5f, 3.3f, 5.6f};

        float S = Array[0] + Array[1] + Array[2];
        float P = Array[0] * Array[1] * Array[2];
        float E = (Array[0] + Array[1] + Array[2])/3;

        System.out.println("Сумма: "+ S);
        System.out.println("Произведение: "+P);
        System.out.println("Среднее: "+E);
    }
}
