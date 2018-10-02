package belajar;

import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        // deklarasi variabel
    int a,b,c,d,e,f;
Scanner keyboard = new Scanner (System.in);

System.out.print("angka pertama                   :  ");
          a= keyboard.nextInt();
System.out.print("angka kedua                     :  ");
          b= keyboard.nextInt();

          c= a+b;
          System.out.println("penjumlahan          :  "+c);

          d= a-b;
          System.out.println("pengurangan          :  "+d);

          e= a*b;
          System.out.println("perkalian            :  "+e);

          f= a/b;
          System.out.println("pembagian            :  "+f);


}
}