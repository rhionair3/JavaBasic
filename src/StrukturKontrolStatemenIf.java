/**
 *
 * @author Thianur
 */
public class StrukturKontrolStatemenIf {
    public static void main(String[] args) {
        double nilai = 97.0;
        if( nilai >= 90 ){
            System.out.println( "Wih Bagus Banget!" );
        }
        else if( (nilai < 90) && (nilai >= 80)){
            System.out.println("Bagus Deh!" );
        }
        else if( (nilai < 80) && (nilai >= 60)){
            System.out.println("Tetap semangat Belajar!" );
        }
        else{
            System.out.println("Gagal Coy.");
        }
    }
}
