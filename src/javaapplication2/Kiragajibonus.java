/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Noor Aiman
 */
import java. util.*;
public class Kiragajibonus {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int pel;
        double gaji;
        double bonus;
        
        System.out.print("Masukkan bilangan pelanggan anda :");
        pel=scan.nextInt();
        
        if (pel < 11){
            bonus=550;
        
        }else if(pel < 50){
            bonus=1400;
            
        }else if(pel < 100){
            bonus=2500;
            
        }else{
            bonus=10500;
        }  
        gaji=800+bonus;
        
        System.out.println("<---------------->");
        System.out.println("Gaji anda adalah RM"+gaji);
        System.out.println("<---------------->");
                    
           
    }
}
    
    

