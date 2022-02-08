
package jframe.ramki;

import javax.swing.*;
import java.awt.*; // awt - abstract window toolkit
/**
 * 
 * @author pawelstradomski
 */


public class JFrameRamki extends JFrame
{
    
    public JFrameRamki()
    {
            
    /*
    {
        JFrame frame = new JFrame();                            //stworzono obiekt ramki.W ("Rakieta") mozna wpisac tytul ramki.
        
        frame.setVisible(true);                                 //uwidocznia stworzona ramke
        
        frame.setTitle("Rakieta");                              //nadaje tytul ramki
        
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //w() wpisz: JFrame.EXIT_ON_CLOSE lub wartosc 1do3
        frame.setDefaultCloseOperation(3);                      //HIDE_ON_CLOSE = 1;
                                                                //DISPOSE_ON_CLOSE = 2;
                                                                //EXIT_ON_CLOSE = 3;
        frame.setSize(200, 100);                                //ustawia wielkosc ramki
//      frame.setSize(new Dimension(300, 300));                 //2g sposob ustawienia ramki

        frame.setLocation(600, 300);                            //ustawia polozenie ramki      
//      frame.setLocation(new Point(700, 400));                 //inny sposob ustawienia 

        frame.setBounds(50, 50, 300, 300);                      //ustawia odrazu lokacje i wymiary
        
        frame.setResizable(false);                              //true - nie blokuje powiekszanie ramki
                                                                //false - blokuje powiekszania ramki
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("kurs.jpg"));//pobiera obraz ikonki
        
    Ramki nie tworzy sie zazwyczaj tak jak na powyzszym sposobie. To tylko mmialo zaprezentowac konstrukcje.    
    Ramke tworzy sie, robiac rozszerzenie klasy np JFrameRamki extends JFrame  i dalej przez this.  
    */   
    
    this.setTitle("Rakieta2.0");
    this.setVisible(true);                  //lub sposob na dole
    this.setBounds(600, 300, 200, 200);
    this.setResizable(false);
    this.setDefaultCloseOperation(3);
   
        
    }
    public static void main(String[] args) {
        
        new JFrameRamki().setVisible(true); //ramke musimy stworzyc rowniez w metodzie main
        
       
        
    }
    
}
