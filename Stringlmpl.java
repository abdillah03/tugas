package belajar;
import java.util.Scanner;
public class Stringlmpl {
    public static void main(Stringlmpl[] args) {
        // deklarasi variabel
        String a,b,c,d,e,f,g,h;
Scanner keyboard = new Scanner (System.in);

System.out.print("Nama                   :  ");
          a= keyboard.next();
System.out.print("NIM                    :  ");
          b= keyboard.next();
System.out.print("Tanggal Lahir          :  ");
          c= keyboard.next();
System.out.print("Umur                   :  ");
          d= keyboard.next();
System.out.print("Jenis Kelamin          :  ");
          e= keyboard.next();
System.out.print("Agama                  :  ");
          f= keyboard.next();
System.out.print("Hoby                   :  ");
          g= keyboard.next();
System.out.print("Alamat                 :  ");
          h= keyboard.next();
System.out.println("------------------BIODATA MAHASISWA-------------------");     
            System.out.println("Nama Lengkap           :  " + a);
            System.out.println("NIM                    :  " + b);
            System.out.println("Tanggal Lahir          :  " + c);
            System.out.println("Umur                   :  " + d);
            System.out.println("Jenis Kelamin          :  " + e);
            System.out.println("Agama                  :  " + f);
            System.out.println("Hoby                   :  " + g);
            System.out.println("Alamat                 :  " + h);
}
}