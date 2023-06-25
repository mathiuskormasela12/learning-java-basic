public class Looping {
    public static void main(String[] args) {
        /*
        * Looping merupakan sebuah statement dalam Java
        * yang berguna untuk melakukan perulangan atau mengulang
        * beberapa kode yg sama.
        *
        * Dalam Java terdapat 4 jenis looping
        * yaitu, for-loop, while-loop, do-while
        * dan for each.
        * */

        // For-loop
        /*
        * for(init statement; condition statement; post statement) {
        *   statement
        * }
        *
        * init statement akan di eksekusi sekali.
        * condition statement akan di eksekusi setiap melakukan looping
        * post statement di jalankna setelah menjalankan statement utama.
        *
        * init statement, condition statement & post statement optional.
        * jika kita tidak mendefinisikan ketiga hal tersebut, maka kondisinya
        * akan di anggap selalu true dan akan menghasilkan infinity loop.
        * */
        System.out.println("For Loop");
        for(int num = 1; num <= 10; num++) {
            System.out.println(num);
        }

        System.out.println("");

        System.out.println("While Loop");
        // while loop
        int x = 1;
        while(x <= 5) {
            System.out.println(x);
            x++;
        }

        System.out.println("");

        System.out.println("Do While");
        // Do-while
        // akan di eksekusi minimal sekali meski kondisi nya tidak terpenuhi
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while(i < 7);

        System.out.println("");

        System.out.println("Break & Conntinue");
        for(var k = 1; k <= 10; k++) {
            // Break akan menghentikan looping
            if(k == 9) {
                break;
            }

            // Continue akan skip looping
            // akan menghentikan looping saat ini dan akan melakukuan looping selanjutnya
            if(k == 5) {
                continue;
            }

            System.out.println("Looping => " + k);
        }

        // For each
        // untuk melooping array
        String[] gfriend = new String[]{
                "Kim Sojung",
                "Jung Yerin",
                "Jung Eunbi",
                "Choi Yuna",
                "Hwang Eunbi",
                "Kim Yewon"
        };
        System.out.println("Gfriend Members");
        for(String member: gfriend) {
            System.out.println(member);
        }
    }
}
