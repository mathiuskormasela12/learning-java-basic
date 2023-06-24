public class Conditional {
    public static void main(String[] args) {
        // If Statement
        var nilai = 90;
        if(nilai >= 90) {
            System.out.println("Very Good");
        } else if (nilai < 90 && nilai >= 80) {
            System.out.println("Good");
        } else if(nilai < 80 && nilai >= 75) {
            System.out.println("Enough");
        } else if(nilai < 75 && nilai > 60) {
            System.out.println("Kurang");
        } else {
            System.out.println("Bad");
        }

        // Switch Statement
        var check = "Java";
        switch(check) {
            case "Java" :
                System.out.println("Java Lang");
                break;
            case "Javascript" :
                System.out.println("Javascript Lang");
                break;
            default :
                System.out.println("Another");
        }

        // Switch Lambda (di support sejak java versi 14)
        // bentuk lebih ringkas dari swicth statement
        // dimana tidak perlu menulis keyword break
        switch(check) {
            case "Java" -> System.out.println("Java Lang");
            case "Javascript" -> {
                // Pake kurung kurawal jika statementnua multiline
                System.out.println("Javascript Lang");
            }
            default -> System.out.println("Another");
        }

        // Switch with Yield (di support sejak Java 14)
        // jika ingin membuat switch case mereturn value
        String nawa = "Yerin";
        String kalimat = switch(nawa) {
            case "Mathius" :
                yield "Hello Mathius";
            case "Yerin" :
                yield "Yerin loves Mathius";
            default:
                yield "Hmmm";
        };
        System.out.println(kalimat);

        // Ternary Operator
        // Mempersingkat kondisional if-else
        Integer val = 100;
        System.out.println(val == 100 ? "Yeah" : "Hmmmm");
    }
}
