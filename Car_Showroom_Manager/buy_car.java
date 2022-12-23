import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;        
public class buy_car {
    buy_car(){
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Company of the car: ");
        String company_name = inp.next();
        company_name = company_name.toLowerCase();
        System.out.println("Enter the Model of the car: ");
        String model = inp.next();
        model = model.toLowerCase();
        System.out.println("Enter the Make year: ");
        String year = inp.next();
        year = year.toLowerCase();
        System.out.println("Enter Fuel type: ");
        String fuel = inp.next();
        fuel = fuel.toLowerCase();
        System.out.println("Enter the Transmission type of the: ");
        String transmission_type = inp.next();
        transmission_type = transmission_type.toLowerCase();
        inp.close();
        int check = 1;
        int count = 0;

    try {
      File file = new File("Car.txt");
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      sc.close();
      
    } catch (Exception e) {
      e.getStackTrace();
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
            String company_check = String.valueOf(each_car[0].trim().toLowerCase());
            String model_check = String.valueOf(each_car[1].trim().toLowerCase());
            String year_check = String.valueOf(each_car[2].trim().toLowerCase());
            String fuel_check = String.valueOf(each_car[3].trim().toLowerCase());
            String transmission_check = String.valueOf(each_car[4].trim().toLowerCase());
            if((company_check==company_name) && (model_check==model) && (year_check==year) && (fuel_check==fuel) && (transmission_check==transmission_type)){
                check = 1;
                System.out.println("Car exist");
            }
        }
        reader.close();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
   
    if(check==1){
        JFrame f=new JFrame("Payment Window");
        Icon icon = new ImageIcon("QR.png");            
        JButton QR=new JButton(icon);
        QR.setBounds(50,250,300,300);
        JButton payment_confirm=new JButton("Payment Confirm");
        payment_confirm.setBounds(50,100,200,100);
        f.add(QR);
        f.add(payment_confirm);
        payment_confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                 JFrame f= new JFrame("Label Example");  
                 JLabel l1,l2;  
                 l1=new JLabel("Invoice");  
                 l1.setBounds(50,50, 100,30);  
                 l2=new JLabel("Car Showroom");  
                 l2.setBounds(50,100, 100,30);
                 f.add(l1);
                 f.add(l2);
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                 LocalDateTime now = LocalDateTime.now();
                 JLabel l3 = new JLabel(dtf.format(now));
                 JLabel l4 = new JLabel("Payment Done, Thank You!!");
                 l4.setBounds(50, 150, 150, 30);
                 l3.setBounds(50,200,300,30);
                 f.add(l3);
                 f.add(l4);
                 f.setSize(300,400);
                 f.setLayout(null);  
                 f.setVisible(true);  

                //System.out.println("Invoice");
                //System.out.println("Car Showroom - New Delhi");
                //System.out.println("Car Company : " company_name);
                //System.out.println("Car model: "+ model);
                //System.out.println("Car make year: "+ year );
                //System.out.println("Fully Paid"); 
                      }  
                    }); 
        f.setSize(400,600);    
        f.setLayout(null);    
        f.setVisible(true);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
    }
    else{
        System.out.println("incorrect details click on buy car again to restart !");
    }
}
public static void main(String[] args) {
    new buy_car();
    }
}
