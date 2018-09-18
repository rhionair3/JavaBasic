public class StrukturKontrolPercabanganCOntinue {
  public static void main(String[] args) {
  
  //   Continue Berlabel
  labelPercabangan:
  for( int x = 0; x < 5; x++ ){
    for( int y = 0; y < 5; y++ ){
      System.out.println("Inside for(j) loop"); //message1

      if( y == 2 ) {
        continue labelPercabangan;
      }
    }
    System.out.println("Inside for(i) loop"); //message2
  }
  //    Continue Tidak Berlabel

    String nama[] = {"Jonder", "Bangkis", "Somplak", "Bajigur"};
    int count = 0;
    for( int i = 0; i<nama.length; i++ ){
      if( !nama[i].equals("Somplak") ){
        continue; //skip next statement
      }
      count++;
    }
    System.out.println("Nemu " + count + " nama dalam list nama");
  }
}
