
package ktpsederhana;

import java.util.Scanner;

public class KTPSederhana {

    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner (System.in);
        
        //Variabel
        String nama,alamat,kecamatan,kelurahanDesa,tempatLahir,jenisKelamin,agama,status,kewarganegaraan,pekerjaan,golonganDarah;
        int nomorInduk, tanggalLahir, rt, rw;
     
        //Input Data
        System.out.println("####### MEMBUAT KTP  #######");
        System.out.println("Tuliskan Data Diri Anda Untuk Membuat KTP !");
        
     System.out.println("Nama Lengkap    : ");
     nama = input.nextLine();
     
     System.out.print("Tempat Lahir         : ");
     tempatLahir = input.nextLine();
     
     System.out.print("Jenis Kelamin        : ");
     jenisKelamin = input.nextLine();
     
     System.out.print("Agama                : ");
     agama = input.nextLine();
     
     System.out.print("Status               : ");
     status = input.nextLine();
     
     System.out.print("Kewarganegaraan      : ");
     kewarganegaraan = input.nextLine();
     
     System.out.print("Pekerjaan            : ");
     pekerjaan = input.nextLine();
     
     System.out.print("Golongan Darah       : ");
     golonganDarah = input.nextLine();
    
     System.out.print("Alamat               : ");
     alamat = input.nextLine();
     
     System.out.print("Kelurahan / Desa     : ");
     kelurahanDesa = input.nextLine();
     
     System.out.print("Kecamatan            : ");
     kecamatan = input.nextLine();
     
     System.out.print("Rukun Tetangga       : ");
     rt = input.nextInt();
     
     System.out.print("Rukun Warga          : ");
     rw = input.nextInt();
     
     System.out.print("Nomor Induk          : ");
     nomorInduk = input.nextInt();
     
     System.out.print("Tanggal,Bulan dan Tahun  Lahir : ");
     tanggalLahir = input.nextInt();
     
     //Tampilan Output Data
     System.out.println("DATA ANDA SEDANG DI PROSES,TUNGGU SEBENTAR!");
     System.out.println("/n");
      
     System.out.println("((((((( E-KTP JAVANESE )))))))");
     System.out.println("Nomor Induk              : "+nomorInduk);
     System.out.println("Nama Lengkap             : "+nama);
     System.out.println("Tempat dan Tanggal Lahir : "+tempatLahir+", "+tanggalLahir);
     System.out.println("Jenis Kelamin            : "+jenisKelamin+"               Gol. Darah : "+golonganDarah);
     System.out.println("Alamat                   : "+alamat);
     System.out.println("RT/RW                    : "+rt+"/"+rw);
     System.out.println("Kel/Desa                 : "+kelurahanDesa);
     System.out.println("Kecamatan                : "+kecamatan);
     System.out.println("Agama                    : "+agama);
     System.out.println("Status Perkawinan        : "+status);
     System.out.println("Pekerjaan                : "+pekerjaan);
     System.out.println("Kewarganegaraan          : "+kewarganegaraan);
     System.out.println("Berlaku Hingga           : Seumur Hidup");
     
     System.out.println (" Selamat KTP Anda Telah Selesai Teregistrasi! ");
    }
}