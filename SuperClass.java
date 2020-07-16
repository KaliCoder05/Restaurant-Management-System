/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurent_Manager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Vaibh
 */
public class SuperClass {
    public double NorthIndian;
    public double SouthIndian;
    public double Chinese;
    public double Continental;
    public double Biryani_RiceCombos;
    
    public double Milkshakes;
    public double Mojitos;
    public double ColdCoffee;
    public double ColdDrink;
    public double IceTea;
   
    public double Meals;
    public double Drinks;
    public double TotalMeal;
    
    public double SubTotalCost;
    
    
public double GetAmount(){
        Meals = NorthIndian + SouthIndian + Chinese + Continental + Biryani_RiceCombos;
        Drinks = Milkshakes + Mojitos + ColdCoffee + ColdDrink + IceTea;
        TotalMeal = Meals + Drinks;
        SubTotalCost = TotalMeal;
        
        
        
        return 0;
    
}

private JFrame frame;

    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Restaurant Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
        }
         
      
        
    }
    
    public double pNorthIndian = 240.25;
    public double pSouthIndian = 180.50;
    public double pChinese = 200.40;
    public double pContinental = 360.25;
    public double pBiryani_RiceCombos = 140.75;
    
    public double pMilkshakes = 120.25;
    public double pMojitos = 90.10;
    public double pColdCoffee = 100.50;
    public double pColdDrink = 60.75;
    public double pIceTea = 80.25;
    
    //Tax//
    
    public double mcTax = 0.180;
    
    
    public double cFindTax (double cAmount){
        
        double cFindTax = cAmount - (cAmount * mcTax);
        return cFindTax;
    }
    
    }
    
    

