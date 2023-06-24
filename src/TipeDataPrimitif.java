public class TipeDataPrimitif {
    public static void main(String[] args) {
        /*
        * Dalam Java terdapar 2 jenis tipe data,
        * yaitu tipe data primitif dan tipe data bukan primitif.
        * Tipe data bukan primitif akan selalu memiliki nilai
        * default null dan akan selalu memiliki method/function yg
        * dapat digunakan untuk memanipulasi tipe datanya.
        * Secara umur tipe data primitif akan di tulis menggunakan
        * huruf kecil dan tipe data bukan primitf akan di tulis dengan
        * diawali huruf kapital dan di ikuti hurug kecil. Namun khusus
        * tipe data int dan char kan memiliki tipe data bukan primitf nya
        * berupa Integer dan Character*/

        // Tipe data primitif
        int usia = 30;
        boolean menikah = false;
        float nilai = 20.5f;
        double nilai2 = 20.5;

        // Tipe data bukan primitf (pasti memiliki method dan default value nya itu null)
        Integer usia2 = 30;
        Boolean menikah2 = true;
        Float nil = 4.5f;
        Double nil2 = 20.5;
        String test = "wkwkw";

        // Konversi tipe data primitf ke tipe data bukan primitf
        int varInt = 10;
        Integer varInteger  = varInt;
        float val = 10;
        Float x = val;

        // Konversi tipe data bukan primitif ke tipe data primitf (tpi ke jenis yg sama) (bisa langsung)
        Double wk = 10.5;
        double wk2 = wk;

        // Konversi tipe data bukan primitif ke tipe data primitf (tpi ke jenis yg beda) (mesti pake method)
        // kalo tipe data nya gk sesuai hierarki
        // Double lebih besar dari int maka make method
        Double text = 22.5;
        int txt = text.intValue();

        // Ini gk make method karena hierarkinya benar
        // Float lebih besar di banding int
        Double hm = 10.5;
        int hm2 = hm.intValue();
        System.out.println(hm2);
    }
}
