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
public class ujian {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.print("Masukkan no pertama :");
        a=input.nextInt();
        
        System.out.print("Masukkan no kedua :");
        b=input.nextInt();
        
       if (a > b){
           System.out.print("Nombor pertama lebih besar daripada nombor kedua ");
       }
       else if (b > a){
           System.out.println("Nombor kedua lebih besar daripada nombor pertama ");
       }
       else {
           System.out.println("Kedua-dua nombor adalah sama");
       }
    
}
}
    
