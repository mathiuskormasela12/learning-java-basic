public class Variable {
    public static void main(String[] args) {
        /*
        * Varible merupakan sebuah tempat
        * untuk menyimpan nilai dan dengan variable
        * tersebut dapat kita gunakan berulang-ulang.
        * Java merupakan bahasa pemrograman yg static type language,
        * dimana jika kita sudah membuat variable dengan tipe data
        * tertentu, maka kita tidak akan bisa reassign variable nya
        * dengan tipe data yg berbeda.*/

        // Membuat varable cara pertama
        // rumus :
        // tipeData namaVariable;
        // atau
        // tipeData namaVaraible = value;
        // Langsung assign value
        String nama = "Mathius";

        // Membuat variable tanpa assign value
        String lastName;
        // assign value
        lastName = "Kormasela";

        // Membuat variable dengan keyword file (ini di support sejak Java 10)
        // tidak perlu mendefinisikna tipe data nya secara eksplisit
        // karena Java akan secara pintar mengetahui tipe data nya.
        // Lebih di rekomendasikna menggunakan keyword var, karena lebih singkat
        // soalnya kadang ada tipe data yg nama nya panjang
        var usia = 10;

        // Membuat konstanta variable
        // tidak bisa di ubah nilainya
        final String fullName = "Mathius Kormasela";
        final var test = true;

        // Pasti error, karena konstanta variable tidak bisa di ubah
        // test = false;
        //fullName = "wkkw";

        System.out.println(nama);
        System.out.println(lastName);
        System.out.println(usia);
        System.out.println(fullName);
        System.out.println(test ? "Test" : "kwkww");
    }
}
