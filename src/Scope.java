public class Scope {
    public static void main(String[] args) {
        exampleScope();
    }

    static void exampleScope() {
        // Dalam Java scope itu berada dalam curly bracket
        // Karena Java merupakan bahasa program yg Block Scope
        String fullName = "Mathius K";
        {
            // Variable nama hanya bisa di akses di block kode
            // dimana variabe nama di buat. yaitu hanya bisa di akses
            // dari line 11 sampe ke line 15
            String nama = "Mathius";
            System.out.println(nama);
        }

        // Ini akan error soalnya variable nama di buat di scope yg berbeda
        // System.out.println(nama);

        System.out.println(fullName);

        int x = 10;

        {
            // akan error karena variable x sudah di define di luar scope ini
            //int x = 20;
            //System.out.println(x);
        }

        {
            String lovedGirl = "Yerin";
            System.out.println(lovedGirl);
        }

        // gk akan error karena variable nya beda scope
        // jadi intinya jika kita buat variable X di parent scope
        // lalu membuat variable dengan nama yg sama pula di child scope nya yaitu X
        // maka akan error. Karena secara default di global scope nya udh ada variable X.

        // Tetapi jika kita buat variable X di child scope
        // Lalu buat lagi variable X di parent scope nya
        // gk akan error. Karena secara default di global scope method tersebut
        // blm ada variable yg nama nya X.
        String lovedGirl = "Sowon";
        System.out.println(lovedGirl);
    }
}
