package com.company;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Regression.LINEAR;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //123
        // System.out.print("Test123");
//        try(FileWriter writer = new FileWriter("notes3.txt", false))
//        {
//            // запись всей строки
//            String text = "Evelinka";
//            writer.write(text);
//            // запись по символам
//            writer.append('\n');
//            writer.append('E');
//
//            writer.flush();
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
//        try(FileReader reader = new FileReader("notes3.txt"))
//        {
//            // читаем посимвольно
//            int c;
//            while((c=reader.read())!=-1){
//
//                System.out.print((char)c);
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
//    }
//test
        Regression regression = new Regression();
//        regression.regression();
        Resultmy resultmy = regression.regression(LINEAR);

        Resultmy ch = regression.regression(Regression.EXP);
        System.out.println(resultmy);
        System.out.println(ch);
        System.out.println(" x равно " + resultmy.x + " y равно "+ resultmy.y+ "    y расчитанное равно "+ resultmy.yrasch);
//        System.out.println("Сумма x равна" + " " + sumx + "  | " + "Сумма y равна" + " " + sumy + "  | " + "х в квадрате равен " + " " + sumxx + "  | " + "y в квадрате равен " + " " + sumyy + " |  " + "х*y равно " + sumxy);
//
//        System.out.println("Коэффициет a равен" + " " + a + " | " + "Коэффициент b равен" + " " + b1);
//        System.out.println("Величина rr равна" + " " + rr);
    }
}

