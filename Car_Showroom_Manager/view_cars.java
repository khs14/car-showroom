import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;          
public class view_cars{    
view_cars(){    
JFrame f=new JFrame("View Cars");            
JButton city=new JButton("City");
JButton off_road=new JButton("Off Road");
JButton sport = new JButton("Sport");
city.setBounds(100,50,100, 40);
off_road.setBounds(100,250,100, 40);
sport.setBounds(100,500,100, 40);
f.add(city);
city.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
    int count = 0;
    try {
      File file = new File("Car.txt");
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      sc.close();
      
    } catch (Exception exp1) {
      exp1.getStackTrace();
    }
    String cl[] = new String[count];
    int len = 0;
    BufferedReader reader;
    try {
        reader = new BufferedReader(new FileReader(
                "Car.txt"));
        String line = reader.readLine();
        while (line != null) {
            line = reader.readLine();
            cl[len] = line;
            len++;
        }
        for(int o = 0; o<cl.length-1;o++){
            String str = cl[o];
            String[] each_car = str.split(",", 0);
            int inv=Integer.parseInt(each_car[6].trim());
            int type=Integer.parseInt(each_car[7].trim());
            if((type==69)&&(inv>0)){
                System.out.println("Company name: "+each_car[0]);
                System.out.println("Car name: "+ each_car[1]);
                System.out.println("Make year: "+ each_car[2]);
                System.out.println("Fuel type: "+ each_car[3]);
                System.out.println("Transmission mode: "+each_car[4]);
                System.out.println("Price: "+ each_car[5]+" lakhs");
                System.out.println("Type: City");
                System.out.println("=========");
            }
        
        }
        reader.close();
    
     
    } catch (IOException exp) {
        exp.printStackTrace();
    }
    
            }  
        });   
f.add(off_road);
off_road.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        int count = 0;
        try {
          File file = new File("Car.txt");
          Scanner sc = new Scanner(file);
          while(sc.hasNextLine()) {
            sc.nextLine();
            count++;
          }
          sc.close();
          
        } catch (Exception exp1) {
          exp1.getStackTrace();
        }
        String cl[] = new String[count];
        int len = 0;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "Car.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                cl[len] = line;
                len++;
            }
            for(int o = 0; o<cl.length-1;o++){
                String str = cl[o];
                String[] each_car = str.split(",", 0);
                int inv=Integer.parseInt(each_car[6].trim());
                int type=Integer.parseInt(each_car[7].trim());
                if((type==42)&&(inv>0)){
                    System.out.println("Company name: "+each_car[0]);
                    System.out.println("Car name: "+ each_car[1]);
                    System.out.println("Make year: "+ each_car[2]);
                    System.out.println("Fuel type: "+ each_car[3]);
                    System.out.println("Transmission mode: "+each_car[4]);
                    System.out.println("Price: "+ each_car[5]+" lakhs");
                    System.out.println("Type: Off Road");
                    System.out.println("=========");
                }
            
            }
            reader.close();
        
         
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        
                }  
            });
f.add(sport);
sport.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        int count = 0;
        try {
          File file = new File("Car.txt");
          Scanner sc = new Scanner(file);
          while(sc.hasNextLine()) {
            sc.nextLine();
            count++;
          }
          sc.close();
          
        } catch (Exception exp1) {
          exp1.getStackTrace();
        }
        String cl[] = new String[count];
        int len = 0;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "Car.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                cl[len] = line;
                len++;
            }
            for(int o = 0; o<cl.length-1;o++){
                String str = cl[o];
                String[] each_car = str.split(",", 0);
                int inv=Integer.parseInt(each_car[6].trim());
                int type=Integer.parseInt(each_car[7].trim());
                if((type==420)&&(inv>0)){
                    System.out.println("Company name: "+each_car[0]);
                    System.out.println("Car name: "+ each_car[1]);
                    System.out.println("Make year: "+ each_car[2]);
                    System.out.println("Fuel type: "+ each_car[3]);
                    System.out.println("Transmission mode: "+each_car[4]);
                    System.out.println("Price: "+ each_car[5]+" Cr");
                    System.out.println("Type: Sport");
                    System.out.println("=========");
                }
            
            }
            reader.close();
        
         
        } catch (IOException exp) {
            exp.printStackTrace();
        }
        
                }  
            });   
f.setSize(400,700);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    
}         
public static void main(String[] args) {    
    new view_cars();   
}    
}    