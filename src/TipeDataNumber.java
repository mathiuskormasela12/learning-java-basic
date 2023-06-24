public class TipeDataNumber {
    public static void main(String[] args) {
        // Dalam Java tipe data number di bagi menjadi 2 jenis
        // 1. Integer, tipe data yg berisi bilangan bulat
        // 2. Floating Point, tipe data yg berisi bilangan desimal

        // Contoh tipe data Integer
        // 1. Byte, default value 0 jika kita tidak assign value nya
        byte iniByte = 10;

        // 2. Short, default value 0 jika tidak di assign value nya
        // Minimal dan maksimal value yg bisa di tampung short lebih besar
        // di banding byte
        short iniShort = 200;

        // 3. Int, default value 0 jika tidak di assign valuenya
        // Minimal dan maksimal value yg bisa di tamping int lebih besar
        // di banding short
        int iniInt = 50;

        // 4. Long, default value 0 jika tidak di assign valuenya
        // Minimal dan maksimal value yg bisa di tamping long lebih besar
        // di banding int
        long iniLong = 100000;
        // Tipe data long bisa di tulis dengan diakhiri huruf L besar atau l kecil juga
        long iniLong2 = 1000L;
        long iniLong3 = 100000l;

        // Ketika kita memiliki number yg memiliki banyak 0 atau panjang
        // kita bisa menggunakan underscore untuk membuatnya lebih mudah dibaca
        int salary = 14_500_000;

        // Contoh tipe data floating point
        // 1. Float
        // Default value nya 0.0
        // Wajib ditulis dengsn huruf f kecil atau f besar
        float iniFloat = 10.5f;
        float iniFloat2 = 10.5F;

        // 2. Double
        // minimal dan maksimal value yg bisa di tampung
        // double lebih besar di banding float
        double iniDouble = 1000.022;

        // Literals
        // int hex
        // harus di awali keyword di value nya 0x
        // jadi misal jika hex nya adalah 393933
        // maka akan ditulis 0x393933
        int hex = 0x393933;
        // int binary
        // harus di awali keyword 0b di value nya
        // jadi misal jika binary nya adalah 01000
        // maka akan ditulis 0b01000
        int binary = 0b01000;


        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println(iniLong3);
        System.out.println(salary);
        System.out.println(iniFloat);
        System.out.println(iniFloat2);
        System.out.println(iniDouble);
        System.out.println("ini hex" + " " + hex);
        System.out.println("ini binary" + " " + binary);

        // Konversi Tipe data
        // Widening Casting (secara otomatis)
        // Hanya bisa jika tipe data awal nya tingkatannya lebih kecil di banding tipe data akhirnya
        // misal mau ubah byte jadi short, atau short jdi int, atau
        // int jadi long
        // byte > short > int > long > float > double
        int thisInt = 20;
        long thisLong = thisInt;
        System.out.println(thisLong);

        // Narrowing Casting (manual)
        // jika ingin konversi number di luar hierarkinya
        // misal ingin convert double jadi int
        double thisOneDouble = 20.400;
        int thisOneInt = (int) thisOneDouble;
        System.out.println(thisOneInt);
    }
}
