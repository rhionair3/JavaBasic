/**
 *
 * @author Thianur
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFormBufferReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in) );
        String name = "";
        System.out.print("Silahkan Isi Nama Kesukaan Anda:");
        try{
            name = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Eit!, kayaknya Ada yang Error");
        }
        System.out.println("=================================");
        System.out.println("Hi, " + name +"!");
        System.out.println("=================================");
    }
}
