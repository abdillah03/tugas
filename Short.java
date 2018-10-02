package belajar;
import java.util.Scanner;
public class Short {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//mendaklarasikan variabel
		short A,B,C;
		//menganisialisasi variabel
		A=1200;
		B=6000;
		//melakukan operasi menggunakan variabel
		C =(short)( A+B);
		//Menampilkan Nilai dari Variabel 
		System.out.println(C);
		//Melakukan inisialisasi variabel melalui keyboard/input melalui keyboard
		System.out.println("masukan nilai 1");
		short  D=sc.nextShort();
		System.out.println("masukan nilai 2");
		short E=sc.nextShort();
		//penjumlahan
		short F=(short)(D+E);
		System.out.println("hasil "+ F);

	}

}