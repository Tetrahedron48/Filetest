package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String line;
        Double sum= (double) 0;
        String filepath = "C:\\Users\\86185\\Desktop\\Groceries.txt";
        String writerpath="C:\\Users\\86185\\Desktop\\GroceriesFormatted.txt";
        FileReader  fileReader = new FileReader(filepath);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter fileWriter=new FileWriter(writerpath);
        BufferedWriter writer=new BufferedWriter(fileWriter);
        writer.write("****************************************************\n");
        writer.write("ID#        Item                   Quantity        Price (€)\n");
        while((line=reader.readLine())!=null){
            System.out.println(line);
            String [] a=line.split(",");
            Double price= Double.valueOf(a[3]);
            String id=a[0];
            String item=a[1];
            String quantity=a[2];
            sum+=price;
            writer.write(id+"\t\t"+item+ "\t\t" +quantity+"\t\t"+price+'\n');
        }
        writer.write("****************************************************\n");

        String format = String.format("%.2f", sum);
        System.out.println("Total price:"+format);
        writer.write("The grocery shopping total is: €"+format);
        writer.write("\n****************************************************\n");
        reader.close();
        writer.flush();
        writer.close();
    }
}
