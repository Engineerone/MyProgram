package com.guryanov;

import java.util.Stack;
import java.util.Scanner;
public class String4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String MyString = "Java program";
        char ArrayString[] = MyString.toCharArray();
        int CharIndex;

        System.out.print("Введите искомый символ:");
        char FindChar = in.next().charAt(0);
        //int x=1;
        for (int i = 0; i < ArrayString.length; i++) {
            char ch = ArrayString[i];
            if (ch == FindChar) System.out.println("Позиция символа:" + (i+1));
            //x++;
        }
    }
}
