
public class StrukturKontrolPercabanganPercabanganBreak {
  public static void main(String[] args) {
    String nama[] = {"Bajigur", "Otong", "Supri", "Semprul", "Untung"};
    String pencarian = "Otong";
    boolean ketemu = false;
    
    for(int i = 0; i < nama.length; i++) {
      if(nama[i].equals(pencarian)) {
        ketemu = true;
        break;
      }
    }
    if( ketemu ) {
      System.out.println("Nama : " + pencarian + " Ketemu !");
    } else {
      System.out.println("Sepertinya Nama : " + pencarian + " Tidak Ada pada Array !");
    }
  }
}
