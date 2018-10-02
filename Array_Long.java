package belajar;
import java.util.Scanner;
public class Array_Long {
	public static void main(String[] args){
		//Deklarasi Variabel
		long[]harga;
		//Inisialisasi Valuenya
	harga = new long[9];
	harga[0]=190000000;
	harga[1]=250000000;
	harga[2]=370000000;
	harga[3]=100000000;
	harga[4]=150000000;
	harga[5]=500000000;
	harga[6]=130000000;
	harga[7]=120000000;
	harga[8]=100000000;
		//Operasi Variabel dengan tipe array double
		System.out.println("Bilangan dengan tipe data Long :");
		for (int i=0;i<harga.length;i++){
		//Menampilkan Hasil Operasi
			System.out.println("Harga" + i+" = " +harga[i]);
		}
		//Input Nilai Variabel Melalui Keyboard
		System.out.println("Silahkan Input Bilangan dengan Tipe data Long");
		System.out.print("Bilangan :");
		long a =new Scanner(System.in).nextLong();
		System.out.println("Bilangan Yang Anda Masukkan Adalah : " + a);
	}

}

