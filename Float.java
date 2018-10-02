package belajar;

import java.util.Scanner;
public class Float {
    public static void main(String[] args) {
        // deklarasi variabel
    float a,b,c,d,e,f;
Scanner keyboard = new Scanner (System.in);

System.out.print("angka pertama                   :  ");
          a= (int) keyboard.nextFloat();
System.out.print("angka kedua                     :  ");
          b= (int) keyboard.nextFloat();

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