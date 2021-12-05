package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Regression {
    private static String characterType;
   // String characterType ="неизвестная";
    public static final int LINEAR = 1;
    public static final int EXP = 2;
    public static void regression(int typeregression) {
        switch (typeregression) {
            case LINEAR:
                ArrayList<String> list1 = new ArrayList<String>();
                Scanner scan1 = null;
                try {
                    scan1 = new Scanner(new File("Линейная_регрессия.txt"));
                } catch (
                        FileNotFoundException e) {
                    e.printStackTrace();
                }
                while (scan1.hasNextLine()) {
                    String line = scan1.nextLine();
                    //System.out.println(line);
                    list1.add(line);
                }
                scan1.close();

                float sumx = 0;
                float sumxx = 0;
                float sumy = 0;
                float sumyy = 0;
                float sumxy = 0;
                float x = 0, y = 0;
                float a = 0, b1 = 0;
                float rr = 0;
                // float e = sumxy-(sumx*sumy)/list.size();

                for (int i = 0; i < list1.size(); i++) {
                    String line = list1.get(i);//берем линию
                    String[] b = line.split(" ");
                    x = (Float.parseFloat(b[0]));//преобраз в число и кладем в х
                    y = (Float.parseFloat(b[1]));//преобраз в число и кладем в у
                }
                    sumx += x;
                    sumxx += x * x;
                    sumy += y;
                    sumyy += y * y;
                    sumxy += x * y;

                    a = (sumxy - (sumx) * (sumy) / list1.size()) / (sumxx - (sumx) * (sumx) / list1.size());
                    b1 = sumy / list1.size() - a * (sumx / list1.size());
                    rr = (sumxy - (sumx * sumy) / list1.size()) * (sumxy - (sumx * sumy) / list1.size()) / ((sumxx - ((sumx) * (sumx)) / list1.size()) * (sumyy - ((sumy) * (sumy)) / list1.size()));
                    System.out.println(" " + x + "  " + y + "  " + x * x + "  " + y * y + "  " + x * y);
                    System.out.println("Сумма x равна" + " " + sumx + "  | " + "Сумма y равна" + " " + sumy + "  | " + "х в квадрате равен " + " " + sumxx + "  | " + "y в квадрате равен " + " " + sumyy + " |  " + "х*y равно " + sumxy);

                    System.out.println("Коэффициет a равен" + " " + a + " | " + "Коэффициент b равен" + " " + b1);
                    System.out.println("Величина rr равна" + " " + rr);
                    System.out.println("_______Линейная регрессия_______");

                    break;
                    case EXP:
                        ArrayList<String> list2 = new ArrayList<String>();
                        Scanner scan2 = null;
                        try {
                            scan2 = new Scanner(new File("Экспоненциальная.txt"));
                        } catch (
                                FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        while (scan2.hasNextLine()) {
                            String line = scan2.nextLine();
                            //System.out.println(line);
                            list2.add(line);
                        }
                        scan2.close();
                    default:
                        break;

                }
//        ArrayList<String> list = new ArrayList<String>();
//        Scanner scan = null;
//        try {
//            scan = new Scanner(new File("Линейная_регрессия.txt"));
//        } catch (
//                FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while (scan.hasNextLine()) {
//            String line = scan.nextLine();
//            //System.out.println(line);
//            list.add(line);
//        }
//        scan.close();
//        float sumx = 0;
//        float sumxx = 0;
//        float sumy = 0;
//        float sumyy = 0;
//        float sumxy = 0;
//        float x = 0, y = 0;
//        float a = 0, b1 = 0;
//        float rr = 0;
//        // float e = sumxy-(sumx*sumy)/list.size();
//
//        for (int i = 0; i < list1.size(); i++) {
//            String line = list1.get(i);//берем линию
//            String[] b = line.split(" ");
//            x = (Float.parseFloat(b[0]));//преобраз в число и кладем в х
//            y = (Float.parseFloat(b[1]));//преобраз в число и кладем в у
//
//            sumx += x;
//            sumxx += x * x;
//            sumy += y;
//            sumyy += y * y;
//            sumxy += x * y;
//
//            a = (sumxy - (sumx) * (sumy) / list1.size()) / (sumxx - (sumx) * (sumx) / list1.size());
//            b1 = sumy / list1.size() - a * (sumx / list1.size());
//            rr = (sumxy - (sumx * sumy) / list1.size()) * (sumxy - (sumx * sumy) / list1.size()) / ((sumxx - ((sumx) * (sumx)) / list1.size()) * (sumyy - ((sumy) * (sumy)) / list1.size()));
//            System.out.println(" " + x + "  " + y + "  " + x * x + "  " + y * y + "  " + x * y);


//                System.out.println("Сумма x равна" + " " + sumx + "  | " + "Сумма y равна" + " " + sumy + "  | " + "х в квадрате равен " + " " + sumxx + "  | " + "y в квадрате равен " + " " + sumyy + " |  " + "х*y равно " + sumxy);
//
//                System.out.println("Коэффициет a равен" + " " + a + " | " + "Коэффициент b равен" + " " + b1);
//                System.out.println("Величина rr равна" + " " + rr);


    }
}

