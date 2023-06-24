public class OperasiMatematika {
    public static void main(String[] args) {
        int x = 200;
        int y = 10;

        // Penjumlahan
        System.out.println(x + y);

        // Pengurangan
        System.out.println(x - y);

        // Perkalian
        System.out.println(x * y);

        // Pembagian
        System.out.println(x / y);

        // Modulus
        System.out.println(x % y);

        // Augmanted Assignment
        x += 2;
        x -= 2;
        x *= 0;
        x /= 10;
        x %= 2;
        System.out.println(x);

        // Unary Operator
        // Increment (+1)
        int s = 10;
        s++;

        // Decrement (-1)
        s--;
        System.out.println(s);

        // Negative
        int k = -10;
        System.out.println(k);

        // Positive
        k = +10;
        k = 10;
        System.out.println(k);

        // Negasi
        boolean menikah = false;
        System.out.println(!menikah);
    }
}
