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
        float sum = 0;
        float sr = 0;
        float x = 0, y=0;

        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);
            String[] b = line.split(" ");
            floatArrayList1.add(Float.parseFloat(b[0]));
            floatArrayList2.add(Float.parseFloat(b[1]));
            float f = Float.parseFloat(line);
            sum += f;
            System.out.println(line + " "+f);
        }
        sr = sum/list.size();
        System.out.println("Сумма равна" + " "+sum + "Среднее равно"+sr);
        System.out.println(line + " "+x +" "+y);



    }
}

