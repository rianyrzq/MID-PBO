/*Nama : Riany Rezeqy Utamie 
Nim : 13020210088*/

public class TesErr20088 {
   public static void main(String[] args){
        int tot = 2;
        int j = 6;
        for (int i = 0; i < 10; i++) {
            tot += i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while (j < 10);
    }   
}
 