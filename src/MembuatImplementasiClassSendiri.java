/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thianur
 */
public class MembuatImplementasiClassSendiri {
  public static void main(String[] args) {
    MembuatClassSendiri bajigurRecord = new MembuatClassSendiri();
    MembuatClassSendiri otongRecord = new MembuatClassSendiri();
    MembuatClassSendiri sitiRecord = new MembuatClassSendiri();
    
    // identifikasi nama baru ganti nama
    // Implementasi dari class MembuatClassSendiri(Stirng temp);
    MembuatClassSendiri recordBajigur = new MembuatClassSendiri("Timus");
    // Implementasi dari class MembuatClassSendiri(Stirng nama, String jabatan);
    MembuatClassSendiri recordOtong = new MembuatClassSendiri("Coboi", "Senior Staff");
    // Implementasi dari class MembuatClassSendiri(double gaji, double rating, double tingkat);
    MembuatClassSendiri recordCombro = new MembuatClassSendiri(1000000, 20, 15);
    
    // Membuat Record Nama baru sesuai masing-masing variabel
    bajigurRecord.setNamaKaryawan("Bajigur");
    otongRecord.setNamaKaryawan("Otong");
    sitiRecord.setNamaKaryawan("Siti");
    
    //Mengambil nama yang telah dibuat dalam record sesuai masing-masing variabel
    String namaBajigur = bajigurRecord.getNamaKaryawan();
    String namaOtong = otongRecord.getNamaKaryawan();
    String namaSiti = sitiRecord.getNamaKaryawan();
    
    // Menampilkan Nama Sesuai dengan variabel record
    System.out.println(namaBajigur);
    System.out.println(namaOtong);
    System.out.println(namaSiti);
    
    //Menampilkan Jumlah Karyawan Sesuai dengan input set yang dilakukan
    System.out.println("Jumlah karyawan Terdaftar : " + MembuatClassSendiri.getMembuatClassSendiri());
    
    //Memasukkan Data Per karyawan dan per variabel class
    MembuatClassSendiri bajigurData = new MembuatClassSendiri();
    bajigurData.setNamaKaryawan("Bajigur");
    bajigurData.setJabatanKaryawan("Senior Staff");
    bajigurData.setTingkatKaryawan(20);
    bajigurData.setUmurKaryawan(35);
    bajigurData.setGajiKaryawan(12);
    bajigurData.setRatingKaryawan(15);
    
    //Print Data Bajigur Sesuai set masing-masing variabel
    bajigurData.print(bajigurData.getNamaKaryawan());
    bajigurData.print(bajigurData.getGajiKaryawan(),
                      bajigurData.getTingkatKaryawan(),
                      bajigurData.getRatingKaryawan(),
                      bajigurData.getGajiTotal());
  }
}
