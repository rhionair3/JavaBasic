public class StrukturKontrolPercabanganBreakBerlabel {
  public static void main(String[] args) {
    int[][] angka = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int cariAngka = 11;
    boolean temuanAngka = false;
    
    labelCari:
    for(int i = 0; i < angka.length; i++) {
      for(int j = 0; j < angka[i].length; j++) {
        if(cariAngka == angka[i][j]) {
          temuanAngka = true;
          break labelCari;
        }
      }
    }
    if(temuanAngka) {
      System.out.println("Angka : " + cariAngka + " Ditemukan Dalam Deret Angka");
    } else {
      
      System.out.println("Angka : " + cariAngka + " Tidak Ditemukan Dalam Deret Angka");
    }
  }
}
