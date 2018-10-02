package belajar;

import java.util.Scanner;
public class Byte {
    public static void main(String[] args) {
        // deklarasi variabel
    byte a,b,c,d,e,f;
Scanner keyboard = new Scanner (System.in);

System.out.print("angka pertama                   :  ");
          a= keyboard.nextByte();
System.out.print("angka kedua                     :  ");
          b= keyboard.nextByte();

          c= (byte) (a+b);
          System.out.println("penjumlahan          :  "+c);

          d= (byte) (a-b);
          System.out.println("pengurangan          :  "+d);

          e= (byte) (a*b);
          System.out.println("perkalian            :  "+e);

          f= (byte) (a/b);
          System.out.println("pembagian            :  "+f);


}
}