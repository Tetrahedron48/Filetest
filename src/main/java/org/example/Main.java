package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String line;
        Double sum= (double) 0;
        String filepath = "C:\\Users\\86185\\Desktop\\Groceries.txt";

          FileReader  fileReader = new FileReader(filepath);

        BufferedReader reader = new BufferedReader(fileReader);
        while((line=reader.readLine())!=null){
            System.out.println(line);
            String [] a=line.split(",");
            Double n= Double.valueOf(a[3]);
            sum+=n;
        }
        String format = String.format("%.2f", sum);
        System.out.println("Total price:"+format);
        reader.close();
    }
}
