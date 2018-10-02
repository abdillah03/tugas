package belajar;


import java.util.Scanner;

public class Char {
public static void main(String args[]) {
    // deklarasi variabel
    String a,b;
Scanner keyboard = new Scanner (System.in);
System.out.print("pertama                   :  ");
          a= keyboard.next();
System.out.print("kedua                  :  ");
          b= keyboard.next();
System.out.println(Character.isLetter('a'));
System.out.println(Character.isLetter('b'));
}
}