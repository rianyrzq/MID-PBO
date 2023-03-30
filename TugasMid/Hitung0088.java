//Riany Rezeqy Utamie 13020210088

import java.util.Scanner;
  
public class Hitung0088{
   public static void main(String[] args){
       int Dollar, Rupiah;
       Scanner in = new Scanner(System.in);
       System.out.print("Mil : ");
       Dollar = in.nextInt();
       Rupiah = Dollar * 1509480;
       System.out.println("Hasil "+Dollar+" dollar = "+Rupiah+" Rupiah");
   }
}