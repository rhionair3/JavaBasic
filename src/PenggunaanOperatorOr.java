/**
 *
 * @author Thianur
 */
public class PenggunaanOperatorOr {
    public static void main(String[] args) {
        int a = 0;
        int b = 20;
        boolean c = false;
        // Penggunaa Operator AND "&&"
        c = ( a > 20) || (b++ > 9);
        System.out.println("Penggunaan Operator OR || Mencari Hasil c = ( a > 20) || (b++ > 9);");
        System.out.println("====================================================================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("====================================================================");
        System.out.println("Penggunaan Operator OR | Mencari Hasil c = ( a > 20) | (b++ > 9);");
        System.out.println("====================================================================");
        c = ( a > 20) | (b++ > 9);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("============================================================================");
        System.out.println("Penggunaan Operator Ekslusif OR '^' Mencari Hasil c = ( a > 20) | (b++ > 9);");
        System.out.println("============================================================================");
        boolean nilai1 = true;
        boolean nilai2 = true;
        System.out.println(nilai1 ^ nilai2);
        nilai1 = false;
        nilai2 = true;
        System.out.println(nilai1 ^ nilai2);
        nilai1 = false;
        nilai2 = false;
        System.out.println(nilai1 ^ nilai2);
        nilai1 = true;
        nilai2 = false;
        System.out.println(nilai1 ^ nilai2);
        System.out.println("=======================");
        System.out.println("Penggunaan Operator Not");
        System.out.println("=======================");
        boolean nilai3 = true;
        boolean nilai4 = false;
        System.out.println(!nilai3);
        System.out.println(!nilai4);
        String status = "";
        int grade = 80;
        System.out.println("=======================");
        System.out.println("Penggunaan Operator ?: Untuk Melihat Status Kelulusa");
        System.out.println("=======================");
        status = (grade >= 60)?"Lulus":"Gagal";
        System.out.println( status );
        int nilai = 0;
        char jawaban = 'a';
        nilai = (jawaban == 'a') ? 10 : 0;
        System.out.println("Nilai Jawaban = " + nilai );
    }
}
