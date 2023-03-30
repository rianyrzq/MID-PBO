/*Nama : Riany Rezeqy Utamie 
Nim : 13020210088*/

import java.util.Scanner;
  
public class Hitung0088{
   public static void main(String[] args){
       int Dollar;
       double Rupiah;
       Scanner in = new Scanner(System.in);
       System.out.print("Mil : ");
       Dollar = in.nextInt();
       Rupiah = Dollar * 15094.80;
       System.out.println("Hasil "+Dollar+" dollar = "+Rupiah+" Rupiah");
   }
}