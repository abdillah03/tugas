package belajar;

import java.util.Scanner;

public class Long_a {
     public static void main(String[]args){
          Long a;
          Long b;
        Scanner keyboard = new Scanner (System.in);

System.out.print("Nama                   :  ");
          a= keyboard.nextLong();
System.out.print("NIM                    :  ");
          b= keyboard.nextLong();
        long hasil;
        hasil = a * b;
        
        System.out.println("Hasil penggunaan tipe data long "+hasil);
        
    }
}