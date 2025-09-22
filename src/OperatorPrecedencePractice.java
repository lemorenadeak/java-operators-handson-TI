public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * operator precedence, associativity, dan cara mengontrol urutan evaluasi.
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        // - Buat variabel: a = 10, b = 5, c = 2
        int a = 10;
        int b = 5;
        int c = 2;

        // - Hitung hasil dari: a + b * c
        // - Prediksi hasilnya terlebih dahulu, lalu hitung dan print
        // - Tambahkan komentar dengan prediksi vs hasil aktual
        int result1 = a + b * c;
        System.out.println("a + b * c = " + result1 + "  // predicted 20");

        // - Hitung hasil dari: (a + b) * c
        int result2 = (a + b) * c;
        System.out.println("(a + b) * c = " + result2 + "  // predicted 30");
        // - Bandingkan dengan hasil
        System.out.println("Compare: a + b * c = " + result1 + " vs (a + b) * c = " + result2);
        // - Hitung hasil dari: a * b + c / 2
        // - Jelaskan urutan operasi dalam komentar
        int result3 = a * b + c / 2;
        System.out.println("a * b + c / 2 = " + result3 + "  // steps: a*b=50, c/2=1, total=51");


        // - Hitung hasil dari: a / b + c * 2
        // - Tunjukkan evaluasi step-by-step dalam komentar
        int result4 = a / b + c * 2;
        System.out.println("a / b + c * 2 = " + result4 + "  // steps: a/b=2, c*2=4, total=6");

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        // - Buat variabel: x = 15, y = 10, z = 20
        int x = 15, y = 10, z = 20;


        // - Evaluasi: x + y > z - 5
        // - Uraikan urutan evaluasi dalam komentar
        boolean exp1 = x + y > z - 5;
        System.out.println("x + y > z - 5 = " + exp1 + "  // steps: 25 > 15 = true");


        // - Evaluasi: x > y + z / 4
        // - Jelaskan operasi mana yang terjadi lebih dulu
        boolean exp2 = x > y + z / 4;
        System.out.println("x > y + z / 4 = " + exp2 + "  // steps: z/4=5, y+5=15, 15>15=false");

        // - Evaluasi: (x + y) > (z - 5) && x < z
        // - Tunjukkan bagaimana tanda kurung mengubah evaluasi
        boolean exp3 = (x + y) > (z - 5) && x < z;
        System.out.println("(x + y) > (z - 5) && x < z = " + exp3);

        // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
        // - Prediksi hasilnya, lalu verifikasi
        boolean exp4 = x * 2 + y > z && y < x + 5;
        System.out.println("x * 2 + y > z && y < x + 5 = " + exp4 + "  // predicted true, verified true");


        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        // - Buat variabel boolean: p = true, q = false, r = true
        boolean p = true, q = false, r = true;
        // - Evaluasi: p && q || r
        // - Jelaskan mengapa && memiliki precedence lebih tinggi dari ||
        boolean rst1 = p && q || r;
        System.out.println("p && q || r = " + rst1);

        // - Evaluasi: p || q && r
        // - Bandingkan dengan hasil sebelumnya
        boolean rst2 = p || q && r;
        System.out.println("p || q && r = " + rst2);

        // - Evaluasi: !p && q || r
        // - Tunjukkan bagaimana NOT (!) memiliki precedence tertinggi
        boolean rst3 = !p && q || r;
        System.out.println("!p && q || r = " + rst3);

        // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
        // - Bandingkan dengan p && q || r
        boolean rst4 = p && (q || r);
        System.out.println("p && (q || r) = " + rst4);


        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        // - Buat variabel: num1 = 25, num2 = 15, num3 = 30
        int num1 = 25;
        int num2 = 15;
        int num3 = 30;
        // - Evaluasi: num1 > num2 + 5 && num3 / 2 < num1
        // - Uraikan urutan evaluasi lengkap
        int right1 = num2 + 5;
        int right2 = num3 / 2;
        boolean comp1 = num1 > right1;
        boolean comp2 = right2 < num1;
        boolean expr1 = comp1 && comp2;
        System.out.println("1) num1 > num2 + 5 && num3 / 2 < num1");
        System.out.println("   steps: num2+5=" + right1 + ", num3/2=" + right2);
        System.out.println("   comparisons: " + comp1 + " && " + comp2);
        System.out.println("   result: " + expr1);
        System.out.println();

        // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        // - Tunjukkan evaluasi step-by-step

        int sum = num1 + num2;
        int diff = num3 - num1;
        boolean left = sum > 30;
        boolean rightA = diff < 10;
        boolean rightB = num2 > 10;

        // - Gunakan tanda kurung untuk memaksa evaluasi berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        // - Bandingkan hasil dan jelaskan perbedaannya
        int altNum2 = 6;
        boolean A = (num1 + altNum2) > 30;
        boolean B = (num3 - num1) < 10;
        boolean C = altNum2 > 10;
        boolean noParen = A || (B && C);
        boolean withParen = (A || B) && C;
        System.out.println("Example where parentheses change outcome (hypothetical num2=6):");
        System.out.println(" A (sum>30) = " + A + ", B(diff<10) = " + B + ", C(num2>10) = " + C);
        System.out.println(" A || (B && C)  => " + noParen);
        System.out.println(" (A || B) && C  => " + withParen);

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        // - Buat variabel: value = 8
        int value = 8;

        // - Evaluasi: ++value * 2
        int eva = ++value * 2;
        // - Jelaskan operasi mana yang terjadi lebih dulu
        System.out.println("1) ++value * 2");
        System.out.println("   after ++value, value = " + value);
        System.out.println("   result = " + eva);
        System.out.println();

        // - Reset value ke 8, lalu evaluasi: value++ * 2
        // - Bandingkan dengan hasil sebelumnya
        value = 8;
        int eva2 = value++ * 2;
        System.out.println("2) value++ * 2");
        System.out.println("   result (before increment) = " + eva2);
        System.out.println("   after expression, value = " + value);
        System.out.println();

        // - Reset value ke 8, lalu evaluasi: 2 * ++value
        // - Amati urutan evaluasi
        value = 8;
        int eva4 = 2 * ++value;
        System.out.println("3) 2 * ++value");
        System.out.println("   after ++value, value = " + value);
        System.out.println("   result = " + eva4);
        System.out.println();


        // - Reset value ke 8, lalu evaluasi: -value + 10
        // - Tunjukkan bagaimana unary minus memiliki precedence tinggi
        value = 8;
        int eva5 = -value + 10;
        System.out.println("4) -value + 10");
        System.out.println("   -value = " + (-value));
        System.out.println("   result = " + eva5);
        System.out.println();

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6: Operator assignment dan precedence
        // - Buat variabel: a = 5, b = 10
        int aa =5;
        int bb=10;

        // - Evaluasi dan jelaskan: a += b * 2
        // - Tunjukkan bahwa aritmatika terjadi sebelum assignment
        aa += bb * 2;
        System.out.println("1) a += b * 2");
        System.out.println("   result = " + aa);
        System.out.println("   Explanation: multiplication happens before assignment.");
        System.out.println();

        // - Reset a ke 5, lalu evaluasi: a *= b + 3
        // - Jelaskan urutan evaluasi
        aa=5;
        aa *= bb + 3;
        System.out.println("2) a *= b + 3");
        System.out.println("   result = " + aa);
        System.out.println("   Explanation: addition happens before assignment.");
        System.out.println();

        // - Evaluasi: a = b > 5 ? b * 2 : b / 2
        // - Tunjukkan bagaimana ternary operator bekerja dengan assignment
        aa = bb > 5 ? b * 2 : b / 2;
        System.out.println("3) a = b > 5 ? b * 2 : b / 2");
        System.out.println("   condition (b > 5) = " + (bb > 5));
        System.out.println("   result = " + aa); // 20
        System.out.println("   Explanation: ternary chooses between two expressions, then assigns.");
        System.out.println();
        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        // - Buat variabel: a = 8, b = 4, c = 2, d = 6
        int aaa = 8, bbb = 4, ccc = 2, ddd = 6;

        // - Bandingkan hasil dari: a + b * c - d dan (a + b) * (c - d)
        // - Tunjukkan langkah kalkulasi untuk keduanya
        int exprA = aaa + bbb * ccc - ddd;
        System.out.println("a + b * c - d = " + exprA + "  // steps: b*c=8, a+8=16, 16-d=10");
        // - Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b)
        // - Jelaskan bagaimana tanda kurung mengubah logika
        int exprB = (aaa + bbb) * (ccc - ddd);
        System.out.println("(a + b) * (c - d) = " + exprB + "  // steps: (a+b)=12, (c-d)=-4, 12 * -4 = -48");

        // - Buat ekspresi nested kompleks menggunakan beberapa level tanda kurung
        // - Contoh: ((a + b) * c) / (d - 2) > (a - b)
        // - Tunjukkan evaluasi step-by-step
    }
}
