
package Stack;

public class Tumpukan_App {
    public static void main (String [] args){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(34);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        
        long nilai = tumpukan.peek(); // buat variabel baru (nilai) untuk dapat menyimpan nilai top dengan memanggil fungsi peek
        System.out.println("nilai Teratas = "+ nilai);
        System.out.println("Nama saya adalah DESTY NURUL ANITSA 20090134");
        long nilai1 = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+ nilai1);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
        
        
    }
}

