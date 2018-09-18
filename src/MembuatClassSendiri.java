public class MembuatClassSendiri {
  private String namaKaryawan;
  private String jabatanKaryawan;
  private int umurKaryawan;
  private double gajiKaryawan;
  private double ratingKaryawan;
  private double tingkatKaryawan;
  private double getGajiTotal;
  private static int hitungKaryawan;
  
  public MembuatClassSendiri() {
    hitungKaryawan++;
  }
  
  public MembuatClassSendiri(String temp) {
    this.namaKaryawan = temp;
    hitungKaryawan++;
  }
  
  public MembuatClassSendiri(String nama, String jabatan) {
    this.namaKaryawan = nama;
    this.jabatanKaryawan = jabatan;
    hitungKaryawan++;
  }
  
  public MembuatClassSendiri(double gaji, double rating, double tingkat) {
    gajiKaryawan = gaji;
    tingkatKaryawan = tingkat;
    ratingKaryawan = rating;
    hitungKaryawan++;
  }
  
  public String getNamaKaryawan() {
    return namaKaryawan;
  }
  
  public void setNamaKaryawan(String temp) {
    namaKaryawan = temp;
  }
  
  public String getJabatanKaryawan() {
    return jabatanKaryawan;
  }
  
  public void setJabatanKaryawan(String temp) {
    jabatanKaryawan = temp;
  }
  
  public int getUmurKaryawan() {
    return umurKaryawan;
  }
  
  public void setUmurKaryawan(int temp) {
    umurKaryawan = temp;
  }
  
  public double getGajiTotal() {
    double hasil = 0;
    hasil = (gajiKaryawan)+((gajiKaryawan * ratingKaryawan)/100)+((gajiKaryawan * tingkatKaryawan)/100);
    return hasil;
  }
  
  public static int getMembuatClassSendiri() {
    return hitungKaryawan++;
  }
  
  public void print(String temp) {
    System.out.println("Nama Karyawan : " + namaKaryawan);
    System.out.println("Jabatan Karyawan : " + jabatanKaryawan);
    System.out.println("Umur Karyawan : " + umurKaryawan + " Tahun");    
  }
  public void print(double gaji, double tingkat, double rating, double totalGaji) {
    System.out.println("Nama Karyawan : " + namaKaryawan);
    System.out.println("Gaji Karyawan : " + gaji);
    System.out.println("TIngkat Karyawan : " + tingkat);
    System.out.println("Rating Karyawan : " + rating);
    System.out.println("Rating Karyawan : " + totalGaji);
  }
  
  public double getGajiKaryawan() {
    return gajiKaryawan;
  }
  
  public void setGajiKaryawan(double gajiKaryawan) {
    this.gajiKaryawan = gajiKaryawan;
  }
  
  public double getTingkatKaryawan() {
    return tingkatKaryawan;
  }
  
  public void setTingkatKaryawan(double tingkatKaryawan) {
    this.tingkatKaryawan = tingkatKaryawan;
  }
  
  public double getRatingKaryawan() {
    return ratingKaryawan;
  }
  
  public void setRatingKaryawan(double ratingKaryawan) {
    this.ratingKaryawan = ratingKaryawan;
  }
}
