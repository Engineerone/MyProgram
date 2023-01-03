package com.guryanov;

public class String2 {
    public static void main (String[] args){
        char Array[];
        int arlength;
        String MyString = "Anton";
        Array = MyString.toCharArray();
        arlength = Array.length;
        if (arlength%2 != 0) System.out.println(Array[arlength/2]);
        else System.out.println("Длинна строки четная");
            }
}
