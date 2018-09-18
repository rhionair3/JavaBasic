/**
 *
 * @author Thianur
 */
import javax.swing.JOptionPane;

public class InputformJotionPaneDua {
    public static void main(String[] args) {
        String nama     = "";
        String umur        = "";
        String notelp   = "";
        
        nama = JOptionPane.showInputDialog("Silahkan Masukkan Nama : ");
        umur = JOptionPane.showInputDialog("Silahkan Masukkan Umur Kamu : ");
        notelp = JOptionPane.showInputDialog("Silahkan Masukkan Nomor telepon Kamu : ");
        
        String pesan = "Halo " + nama + ", Umurnya " + umur + " Tahun. Boleh Saya Telpon Dengan Nomor : " + notelp + " ?";
        JOptionPane.showMessageDialog(null, pesan);
    }
}
