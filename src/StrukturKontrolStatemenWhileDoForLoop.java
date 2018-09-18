/**
 *
 * @author Thianur
 */
public class StrukturKontrolStatemenWhileDoForLoop {
  public static void main(String[] args) {
    int a = 5;
    int b = 0;
    while(a >=0 ){
      System.out.print(a);
      a--;
    }
    while(b <= 10 ) {
      System.out.print(b);
      b++;
    }
    // Kita bisa menggunakan false dan true untuk nilai while
    // while(true) akan menghasilkan loop berkelanjutan (Infinite Loop)
    // while(false) hanya menghasilkan nilai awal output

    int c = 0;
    do {
      System.out.print(c);
      c++;
    }while (c<=10);
    // Hasil dari keduanya bisa sama, hanya ekspresi do-while-loop
    // akan selalu mengeksekusi ekspresi pertama lalu dikondisikan ulang pada while

    // For Loop dibawah juga mirip dengan while do loop diatas
    // hanya saja nilai batasan dapat ditentukan dalam statement

    int d;
    for( d = 0; d <= 10; d++ ){
      System.out.print(d);
    }
  }
}
