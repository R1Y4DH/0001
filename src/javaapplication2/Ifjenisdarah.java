/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**anda dikehendaki untuk membuat satu aturcara untuk memberi status maklumat penderma darah
 *
 * @author Noor Aiman
 */
import java.util.Scanner;
public class Ifjenisdarah {
    public static void main(String[]args){
   Scanner taip = new Scanner(System.in);
   
    String nama;
    char kumpdarah;
    String makluman;
    System.out.println("Nama anda");
    nama = taip.next();
    System.out.println("kumpulan darah : Taip A/B/O/Z[AB]");
    kumpdarah = taip.next().charAt(0);
    taip.close();
    
    if  (kumpdarah=='A'){
    }   makluman="A dan AB sahaja";
    if (kumpdarah=='B'){
    }   makluman="B dan AB sahaja";
    if (kumpdarah=='Z'){
    }   makluman="AB sahaja";
    if (kumpdarah=='O'){
        makluman="A, B, AB dan O";
    }
    
    System.out.println("Nama : " +nama);
    System.out.println("Kumpulan Darah:"+kumpdarah);
    System.out.println("Anda boleh menerima kepada " +makluman);
    }
}