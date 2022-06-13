/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL;

/**
 *
 * @author Member
 */
public class SubClass extends SuperClass {
    String nama, jenisKe, kelas;
    int absen = 13;
    public void setNama(String nama){
        this.nama = nama;
    }public void setjeKelamin(String jenisKe){
        this.jenisKe = jenisKe;
    }public void setkelas(String Kelas){
        this.kelas = Kelas;
    } public void cetak(){
            System.out.println("========Data Siswa========");
            System.out.println("Nama Siswa      : "+nama);
            System.out.println("Jenis kelamin   : "+jenisKe);
            System.out.println("Kelas           : "+kelas);
            System.out.println("Absen           : "+absen);
            System.out.println();
            System.out.println("~Fakta-fakta tentang Hegel~");
            super.ket1();
            super.ket2();
            super.ket3();
    }
}
