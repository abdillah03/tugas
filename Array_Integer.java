package belajar;

import java.util.Scanner;

public class Array_Integer {
    public static void main(String[] args){
		//Deklarasi Variabel
		int A[] ={9,8,7,6,5,4,3,2,1};
//Inisialisasi Valuenya
		A = new int[9];
		//Operasi Pada Array
		System.out.println("Nomor Index :");
		for (int i=0;i<A.length;i++){
		//Menampilkan Hasil Operasi

		System.out.print(i);
		}
		//Input Bilangan Melalui Keyboard
		System.out.println("Silahkan Input Bilangan Bulat");
		System.out.println("Bilangan :");
		int a =new Scanner(System.in).nextInt();
		System.out.println("Bilangan Yang Anda Masukkan Adalah : " + a);
		
	}
}