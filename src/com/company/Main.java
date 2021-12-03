package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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
    ArrayList<String> list = new ArrayList<String>();
        Scanner scan = null;
        try {
            scan = new Scanner(new File("notes3.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scan.hasNextLine()){
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
        float x = 0, y=0;
        float a = 0, b1=0;
        float rr = 0;
       // float e = sumxy-(sumx*sumy)/list.size();

        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);//берем линию
            String[] b = line.split(" ");
           x=(Float.parseFloat(b[0]));//преобраз в число и кладем в х
           y=(Float.parseFloat(b[1]));//преобраз в число и кладем в у

            sumx += x;
            sumxx += x*x;
            sumy += y;
            sumyy += y*y;
            sumxy += x*y;

            a=(sumxy-(sumx)*(sumy)/list.size())/(sumxx-(sumx)*(sumx)/list.size());
            b1=sumy/list.size()-a*(sumx/list.size());
            rr=(sumxy-(sumx*sumy)/list.size())*(sumxy-(sumx*sumy)/list.size())/((sumxx-((sumx)*(sumx))/list.size())*(sumyy-((sumy)*(sumy))/list.size()));
            System.out.println(" "+x +"  "+y+"  "+ x*x+"  "+y*y+"  "+x*y);
        }

        System.out.println("Сумма равна" + " "+sumx + "  | " + "Сумма равна" + " "+sumy+ "  | "+ "х в квадрате равен " + " "+sumxx + "  | " + "y в квадрате равен " + " "+sumyy+ " |  "+ "х*y равно " +sumxy);

        System.out.println("Коэффициет a равен"+ " "+a+ " | "+ "Коэффициент b равен"+" "+b1);
        System.out.println("Величина rr равна"+ " "+rr);





    }
}

