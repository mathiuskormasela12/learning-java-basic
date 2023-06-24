public class Expression {
    public static void main(String[] args) {
        // Expression
        // sesuatu yg merupakan single value
        // sesuatu yg merupakan value
        String nama = "Mathius";

        // Statement
        // Kumpulan expression
        // sesuatu yg di design untuk sebuah aksi atau melakuan sebuah task
        System.out.println("Halo nama saya " + nama);

        // Block
        // Kumpulan statement. akan di awali
        // kurung kurawal buka dan di akhiri kurung kurawal tutup
        {
            System.out.println("TEST" + " " + nama);
        }

        // Statement Assignment
        int txt = 20;

        // Statement Increment/Decrement
        txt++;
        txt--;

        // StatementMethod Invocation
        // Pemanggilan method
        System.out.println("Test");

        // Statement Object Creation
        //Date date = new Date();
    }
}
