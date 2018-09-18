/**
 *
 * @author Thianur
 */
public class PenggunaanOperatorLogika {
    public static void main(String[] args){
        int a = 0;
        int b = 20;
        boolean c = false;
        // Penggunaa Operator AND "&&"
        c = ( a > 20) && (b++ > 9);
        System.out.println("Penggunaan Operator AND && Mencari Hasil c = ( a > 20) && (b++ > 9);");
        System.out.println("====================================================================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("====================================================================");
        System.out.println("Penggunaan Operator AND && Mencari Hasil c = ( a > 20) & (b++ > 9);");
        System.out.println("====================================================================");
        c = ( a > 20) & (b++ > 9);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
