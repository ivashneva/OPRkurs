package com.company;

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
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = null;
        String nameFile = "";
        switch (typeregression){
            case LINEAR:

               nameFile= "Линейная_регрессия.txt";

                break;
            case EXP:

                nameFile= "Экспоненциальная.txt";

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


        try {
            scan = new Scanner(new File(nameFile));
        } catch (
                FileNotFoundException e) {

            System.exit(4);
            e.printStackTrace();

        }
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            //System.out.println(line);
            list.add(line);
        }
        scan.close();

        float sumx = 0;
        float sumxx = 0;
        float sumy = 0;
        float sumyy = 0;
        float sumxy = 0;
        float x = 0, y = 0;
        float a = 0, b1 = 0;
        float rr = 0;
        // float e = sumxy-(sumx*sumy)/list.size();

        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);//берем линию
            String[] b = line.split(" ");
            x = (Float.parseFloat(b[0]));//преобраз в число и кладем в х
            y = (Float.parseFloat(b[1]));//преобраз в число и кладем в у


            switch (typeregression){
                case LINEAR:



                    break;
                case EXP:
                    y= (float) Math.log(y);
//                case 3rertrP:
//                    x= (float) Math.log(y);
//                    x= (float) Math.log(y);


                default:

                    break;
            }




            sumx += x;
            sumxx += x * x;
            sumy += y;
            sumyy += y * y;
            sumxy += x * y;

            a = (sumxy - (sumx) * (sumy) / list.size()) / (sumxx - (sumx) * (sumx) / list.size());
            b1 = sumy / list.size() - a * (sumx / list.size());
            rr = (sumxy - (sumx * sumy) / list.size()) * (sumxy - (sumx * sumy) / list.size()) / ((sumxx - ((sumx) * (sumx)) / list.size()) * (sumyy - ((sumy) * (sumy)) / list.size()));
            System.out.println(" " + x + "  " + y + "  " + x * x + "  " + y * y + "  " + x * y);


        }
        System.out.println("Сумма x равна" + " " + sumx + "  | " + "Сумма y равна" + " " + sumy + "  | " + "х в квадрате равен " + " " + sumxx + "  | " + "y в квадрате равен " + " " + sumyy + " |  " + "х*y равно " + sumxy);

        System.out.println("Коэффициет a равен" + " " + a + " | " + "Коэффициент b равен" + " " + b1);
        System.out.println("Величина rr равна" + " " + rr);

    }

}

