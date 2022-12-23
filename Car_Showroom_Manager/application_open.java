import javax.swing.*;
import java.awt.event.*;        
public class application_open{    
application_open(){    
JFrame f=new JFrame("Application open");            
JButton view_cars=new JButton("View Cars");
JButton purchase_cars=new JButton("Buy Cars");
view_cars.setBounds(100,50,100, 40);
purchase_cars.setBounds(100,0,100, 40);
f.add(view_cars);
view_cars.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
                new view_cars(); 
            }  
        });   
f.add(purchase_cars);
purchase_cars.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
                    new buy_car(); 
                }  
            });      
f.setSize(300,200);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new application_open();    
}    
}    