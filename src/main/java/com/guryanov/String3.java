package com.guryanov;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Scanner;
public class String3 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку поиска:");
        String Findsub = in.nextLine();
        String MyString = "Разработчик";
        if (MyString.contains(Findsub)) System.out.println("true");
        else System.out.println("false");

    }
}
