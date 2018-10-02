package belajar;
import java.util.Scanner;
public class Array_String {
	public static void main(String[] args){
	//Deklarasi Variabel
	String[]mahasiswa;
	//Inisialisasi Valuenya
	mahasiswa=new String[3];
	mahasiswa[0]="Abdillah_resky_a";
	mahasiswa[1]="Wahidin";
	mahasiswa[2]="Hendra";
	//Operasi Variabel dengan tipe array string
	System.out.println("Nama Mahasiswa :");
	for (int i=0;i<mahasiswa.length;i++){
	//Menampilkan Hasil Operasi
		System.out.println("Nama" + i+" : " +mahasiswa[i]);	
	}
	//Input Nilai Variabel Melalui Keyboard
	System.out.println("Silahkan Input Nama Anda");
	System.out.print("Nama :");
	String a =new Scanner(System.in).nextLine();
	System.out.println("Nama Mahasiswa Yang Anda Masukkan Adalah : " + a);
	}
}
