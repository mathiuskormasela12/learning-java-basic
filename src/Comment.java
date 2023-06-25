public class Comment {
    public static void main(String[] args) {
        // Comment berfungsi untuk memberi informasi mengenai kode yg di tulis
        // dan juga berfungsi untuk mematikan kode program.
        // Di Java Comment tidak akan di eksekusi dan di compile menjadi binary file
        // ada 2 jenis comment di Java yaitu single-line dan multi-line commentar.

        // Ini Single Line Comment
        /*
            Ini Multi Line Commentar
        */

        System.out.println(penjumlahan(10, 20));
    }

    // Contoh Commentar untuk Dokumentasi dalam format Java Doc
    /**
     * Method untuk menjumlahkan value1 dan value2
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan value1 dan value2
     */
    static int penjumlahan(int value1, int value2) {
        return value1 + value2;
    }
}
