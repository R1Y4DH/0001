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
import java.util.Scanner;
public class ifelse1dan2 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int A;
        int B;
        
     System.out.print("Masukkan nombor pertama :");
     A=scan.nextInt();
     
     System.out.print("Masukkan nombor kedua :");
     B=scan.nextInt();
        
    if(A > B){
        System.out.println("Nombor pertama lebih besar");
        
    }else if (B > A){
        System.out.println("Nombor kedua lebih besar");
        
    }else{
        System.out.println("Kedua-dua nombor sama besar");
    }
             
    }
    
}
