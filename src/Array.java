public class Array {
    public static void main(String[] args) {
        // Array merupakan tipe data yg memiliki nilai yg lebih dari
        // satu dan memiliki panjang yg tetap serta setiap nilai
        // nya akan memiliki tipe data yg sama

        // Cara Pertama
        String[] skills;
        skills = new String[3];
        skills[0] = "HTML";
        skills[1] = "CSS";
        skills[2] = "Javascript";

        // Cara Kedua
        String[] skills2 = new String[3];
        skills2[0] = "HTML";
        skills2[1] = "CSS";
        skills2[2] = "JS";

        // Cara Ketiga (tidak perlu mendefinisikan length nya)
        int[] nilai = new int[]{1, 2};

        // Cara Keempat (tidak perlu mendefinisikan length nya)
        Integer[] nilai2 = {4, 5};

        // Mengubah nilai array
        nilai2[1] = 500;

        // Menghapus nilai array
        //  Sebenarnya tidak ada cara untuk dapat menghapus item array di Java
        // karena array pada Java panjang nya selalu tetap.
        // jdi biasanya kita hanya akan mengubah value nya menjadi default
        // value dari masing2 tipe data. Jika array of int maka bisa di set value nya jadi 0
        // atau jika array of Integer maka bisa di set value nya jadi null
        nilai2[1] = null;

        System.out.println(skills[2]);
        System.out.println(skills2[0]);
        System.out.println(nilai[0]);
        System.out.println(nilai2[1]);

        // Menampilkan panjang array
        System.out.println(nilai.length);
    }
}
