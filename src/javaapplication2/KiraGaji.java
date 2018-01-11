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
public class KiraGaji {
public static void main(String[] args){
    Scanner scan=new Scanner (System.in);
    
    String nama;
    int bil_jam;
    int bil_hari;
    int bil_jam_ot;
    int gaji;
    
    System.out.print("Masukkan nama pekerja : ");
    nama=scan.nextLine();
    System.out.print("Masukkan bilangan jam bekerja anda : ");
    bil_jam=scan.nextInt();
    while (bil_jam > 9){
        System.out.println("Bilangan jam bekerja tidak boleh melebihi 9 jam. Sila masukkan bilangan jam yang betul.");
        System.out.print("Masukkan bilangan jam bekerja yang betul : ");
        bil_jam=scan.nextInt();
    }
    
    System.out.print("Masukkan bilangan hari bekerja anda : ");
    bil_hari=scan.nextInt();
    while (bil_hari > 30) {
        System.out.println("Bilangan jam bekerja tidak boleh melebihi 30 hari. Sila masukkan bilangan jam bekerja yang betul");
        System.out.print("Masukkan bilangan hari bekerja yang betul : ");
        bil_hari=scan.nextInt();
    }
    
    System.out.print("Masukkan bilangan jam bekerja lebih masa anda : ");
    bil_jam_ot=scan.nextInt();
    while (bil_jam_ot > 50){
     System.out.println("Bilangan jam bekeerja lebih masa tidak boleh melebihi 50 jam. Sila masukkan bilangan jam bekerja lebhi masa yang betul");
     System.out.print("Masukkan bilangan jam bekerja lebih masa yang betul : ");
     bil_jam_ot=scan.nextInt();
    }
    
    gaji=(bil_jam * bil_hari * 20)+(bil_jam_ot * 15);
    
    System.out.println("===========================");
    System.out.println("===========================");
    System.out.println("Rumusan gaji bulanan "+nama+" :");
    System.out.println("Jumlah jam bekerja :"+bil_jam+" jam");
    System.out.println("Jmulah hari bekerja :"+bil_hari+" hari");
    System.out.println("Jumlah jam bekerja lebih masa :"+bil_jam_ot+" jam");
    System.out.println("Jumlah Gaji: RM"+gaji);
    System.out.println("===========================");
    System.out.println("===========================");

}
}
