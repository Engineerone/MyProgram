package com.guryanov;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {

        char Symbol[] = {'a', 'l', 'l', 'o', 'h', 'a','1','2','3','4'};
        System.out.println(Arrays.toString(Symbol));

        int x;
        String mystring="";

        for (x = 0; x < Symbol.length; x++) {
            mystring = mystring+Symbol[(Symbol.length-1)-x];}
        System.out.println(mystring);
    }
}
