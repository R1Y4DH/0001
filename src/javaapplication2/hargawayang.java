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
public class hargawayang {
public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int umur;
    double harga ;
    char jawapan;
    
    System.out.print("Ada kad ahli (Y/T) :");
    jawapan=input.findInLine(".").charAt(0);
    
    System.out.print("Umur anda sekarang :");
    umur=input.nextInt();
    
    if (umur >=12 || umur <65); {
        harga = 9.25;
    }
    
    if (umur <12 || umur >=65); {
        harga = 5.25;
    }
    
    if ((jawapan == 'Y' || jawapan =='y') &&(umur >=12 || umur < 65)){
        harga = 2.00;
    }
    
    System.out.println("Sila bayar sebanyak RM"+harga+".\nSelamat menonton");

}
}
