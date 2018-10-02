package belajar;
import java.util.Scanner;
public class Array_Short {
	public static void main(String[] args){
		//Deklarasi Variabel
		short[]X ;
		//Inisialisasi Valuenya
		X = new short[9];
		X[0]=45;
		X[1]=30;
		X[2]=35;
		X[3]=15;
		X[4]=10;
		X[5]=25;
		X[6]=18;
		X[7]=36;
		X[8]=11;
		//Operasi Variabel dengan tipe array double
		System.out.println("Bilangan dengan tipe Short :");
		for (int i=0;i<X.length;i++){
		//Menampilkan Hasil Operasi
			System.out.println("Index " + i+" = " +X[i]);
		
	}
		//Input Nilai Variabel Melalui Keyboard
		System.out.println("Silahkan Input Bilangan dengan Tipe Short");
		System.out.print("Bilangan :");
		short a =new Scanner(System.in).nextShort();
		System.out.println("Bilangan Yang Anda Masukkan Adalah : " + a);
    }
}