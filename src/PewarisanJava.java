/*
 * Pewarisan ============
 * Pewarisan dalam bahasa pemrograman sama halnya seperti Pewarisan pada umum
 * Pemilik Aset memberikan hak waris kepada keturunannya dengan syarat dan ketentuan berlaku
 * Jika dalam hak waris keluarga membutuhkan surat ahli waris kepada keturunan
 * maka hak waris dalam bahasa pemrograman disebut extend.
*/
/*
 * @author : Suryo Galih Kencana Harianja
*/
public class PewarisanJava {
  /*
   * Disini menggunakan protected agar variabel "bahasa" dan "tingkat" hanya bisa diakses
   * melalui class PewarisJava Saja. Jadi Class Diluarnya tidak dapat menggunakannya.
   */
  protected String bahasa;
  protected String tingkat;
  
  /*
   * Constructor PewarisanJava
   * Constructor ini akan dipanggil pertama kali dieksekusi saat class PewarisanJava di panggil 
   */
  public PewarisanJava() {
    System.out.println("Dalam Pewarisan:Constructor");
    bahasa = "";
    tingkat ="";
  }
  
  /*
   * Kok Ada lagi ?
   * Ya serupa tapi tak sama. constructor ini untuk pemanggilan disertakan paramenter
   * Constructor PewarisanJava
   * Constructor ini akan dipanggil pertama kali dieksekusi saat class PewarisanJava di panggil 
   */
  public PewarisanJava(String bahasa, String tingkat) {
    System.out.println("Dalam Pewarisan:Constructor");
    this.bahasa = bahasa;
    this.tingkat = tingkat;
  }
  
  public String getBahasa() {
    return bahasa;
  }
  
  public String getTingkat() {
    return tingkat;
  }
  
  public void setBahasa(String bahasa) {
    this.bahasa = bahasa;
  }
  
  public void setTingkat(String tingkat) {
    this.tingkat = tingkat;
  }
}
