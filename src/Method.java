public class Method {
    public static void main(String[] args) {
        // Memanggil method
        sayHello();
        int result = multiply(10, 10);
        System.out.println(result);
        System.out.println(testNama("Yerin"));

        // Di Java ketika ingin ngirim array di parameter method
        // harus kita buat dulu manual array nya baru assign ke methodnya
        int[] nilai = new int[]{1, 2};
        report("Mathius", nilai);

        methodOverloading();
        methodOverloading(10, 10);
        methodOverloading(100);
        methodOverloading("Tayo");

        System.out.println("Faktorial dari 3 adalah " + faktorial(3));

        // Akan menghasilkan stack overflow error
        // karena tumpukan method loop terlalu banyak, sampe ada 10000 stack
        // Jadi be carefull if we're implementing the recursive method
        loop(10000);
    }

    /*
    * Method merupakan kumpulan baris kode
    * yang dapat di panggil beberapa kali.
    * */

    // Membuat method sayHello
    // dalam membuat method untuk static main method, kita harus membuat method nya berupa static method juga
    // Method tanpa return value
    static void sayHello() {
        System.out.println("Hello World");
    }

    // Method dengan return value dan parameter
    static int multiply(int x, int y) {
        return x * y;
    }

    static String testNama(String name) {
        return "Hello I am " + name;
    }

    // Method Variable Argument
    // Mirip seperti rest paramater Javascript
    // Untuk merepresentasikan nilai parameter yg jumlahnya tidak terbatas atau tidak diketahui.
    // parameter nya akan di ubah menjadi array
    static void report(String nama, int... values) {
        System.out.println(nama);
        for(int value : values) {
            System.out.println(value);
        }
    }

    // Method Overloading
    // Dalam Java memungkinkan untuk membuat method dengan nama yg sama
    // asalkan paremeternya berbeda. Hal ini
    // di namakan method Overloading
    static void methodOverloading() {
        System.out.println("Method Overloading 1");
    }

    static void methodOverloading(String text) {
        System.out.println(text);
    }

    static void methodOverloading(Integer num) {
        System.out.println(num);
    }

    static void methodOverloading(Integer x, Integer y) {
        System.out.println(x + y);
    }

    // Recursive Method
    // Method yg akan memanggil diri nya sendiri
    // Namun hati2 kegtika membuat recursive method
    // karena terkadang akan menyebabkan StackOverflow Error
    // Dimana setiap method yg di panggil secara recursive
    // akan menumpuk di dalam stack dan akan membuat Java error
    // ini dpt terjadi tergantung jumlah memory dri laptop kita
    static Integer faktorial(Integer value) {
        if(value == 1) {
            return 1;
        } else {
            return value * faktorial(value - 1);
        }
    }

    // Contoh Stack Overflow Error
    static void loop(int value) {
        if(value == 0) {
            System.out.println("Owarinashita");
        } else {
            System.out.println("Loop - " + value);
            loop(value - 1);
        }
    }
}
