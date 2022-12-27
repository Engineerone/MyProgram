package com.guryanov;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] ArrayDigits = {0,1,2,3,4,5,6,7,8,9};
        int first = ArrayDigits[0];
        int last = ArrayDigits[ArrayDigits.length-1];
        ArrayDigits[0] = last;
        ArrayDigits[ArrayDigits.length-1] = first;
        System.out.println(first);
        System.out.println(last);
        System.out.println(last);
        System.out.println(Arrays.toString(ArrayDigits));
    }
}