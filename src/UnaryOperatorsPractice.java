public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * unary operators, terutama perbedaan antara pre dan post increment/decrement.
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        // Latihan 1: Increment dan decrement dasar
        // - Buat variabel 'counter' dengan nilai 5
        int counter=5;

        // - Gunakan pre-increment (++counter) dan print hasilnya
        System.out.println("counter in pre increment = "+ counter );
        System.out.println("counter in pre increment = "+ (++counter));

        // - Gunakan post-increment (counter++) dan print hasilnya
        System.out.println("counter in post increment = "+ (counter++) );


        // - Reset counter ke 5, lalu gunakan pre-decrement (--counter) dan print hasilnya
        counter=5;
        System.out.println("counter in pre decrement = "+ counter );
        System.out.println("counter in pre decrement = "+ (--counter) );


        // - Gunakan post-decrement (counter--) dan print hasilnya
        System.out.println("counter in post decrement = "+ (counter--) );

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST INCREMENT ===");
        // Latihan 2: Pahami perbedaan antara pre dan post increment
        // - Buat dua variabel: a = 10, b = 10
        int a = 10;
        int b = 10;

        // - Buat variabel 'result1' dan assign nilai dari ++a (pre-increment)
        // - Print kedua 'a' dan 'result1' - amati nilainya
        System.out.println("value of a= " + a);
        int result1 = ++a;
        System.out.println("value of a after pre-increment= " + result1);

        // - Buat variabel 'result2' dan assign nilai dari b++ (post-increment)
        // - Print kedua 'b' dan 'result2' - amati nilainya
        System.out.println("value of b= " + b);

        int result2 = b++;
        System.out.println("value of b after post increment= " + result2);

        // - Jelaskan dalam komentar apa yang Anda amati tentang perbedaannya

        // the difference is that the value of 'a' got increase since the variable result add it before printing it, this is the effect of pre increment
        // value of b on the other hand, its value will get added if 'b' got printed not the result 2 variable this is teh cause of post increment

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST DECREMENT ===");

        // Latihan 3: Pahami perbedaan antara pre dan post decrement
        // - Buat dua variabel: x = 8, y = 8
        int x=8;
        int y=8;

        // - Print nilai dari --x (pre-decrement) dan kemudian print x lagi
        System.out.println("value of x when undergoing the process of pre-decrement= " + --x);
        System.out.println("value of x after the pre-decrement= " +x);

        // - Print nilai dari y-- (post-decrement) dan kemudian print y lagi
        System.out.println("value of y when undergoing the process of post-decrement= " + y--);
        System.out.println("value of y after the post-decrement= " + y);

        // - Tulis komentar yang menjelaskan kapan decrement terjadi pada setiap kasus

        //in pre decrement the value of number affect immediately
        //while post decrement happen when the next time the value got printed

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\n=== UNARY PLUS DAN MINUS ===");

        // Latihan 4: Berlatih operator unary plus dan minus
        // - Buat variabel integer positif 'positive' dengan nilai 42
        int positive=42;

        // - Buat variabel integer negatif 'negative' menggunakan operator unary minus pada positive
        int negative = -positive;


        // - Buat variabel 'backToPositive' menggunakan unary minus pada negative (membuatnya positif lagi)
        int backtopositive = -negative;

        // - Print ketiga variabel tersebut
        System.out.println("value of positive integer= " + positive);
        System.out.println("value of negative integer= " + negative);
        System.out.println("value of backtopositive integer= " + backtopositive);

        // - Demonstrasikan bahwa unary plus tidak mengubah nilai (buat variabel dengan +positive)
        int positive2 = +positive;
        System.out.println("value of positive integer= " + positive2);
        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\\n=== OPERATOR BOOLEAN NOT ===");

        // Latihan 5: Berlatih operator boolean NOT
        // - Buat variabel boolean 'isReady' dengan nilai true
        boolean isReady = true;

        // - Buat boolean lain 'isNotReady' menggunakan operator NOT (!) pada isReady
        boolean isnotReady = !isReady;
        // - Print kedua variabel
        System.out.println("isReady? " + isReady);
        System.out.println("isnotReady? " + isnotReady);

        // - Buat ekspresi boolean yang mengecek apakah suatu angka TIDAK sama dengan no
        // Gunakan angka apapun dan print hasilnya
        int numnum=86;
        boolean no0=(numnum != 0);
        System.out.println("value are not 0?" + no0);
        // - Rangkai beberapa operator NOT: buat variabel dengan !!isReady dan amati hasilnya
        boolean notnotready = !!isReady;
        System.out.println("double not ready>" + notnotready);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 6: Gunakan unary operators dalam skenario praktis
        // - Buat variabel 'attempts' dimulai dari 0
        int attempts = 0;

            // - Simulasikan tiga percobaan login yang gagal dengan increment 'attempts' setiap kali
            // Print "Attempt: " + attempts setelah setiap increment
        System.out.println("attempts : " + (++attempts));
        System.out.println("attempts : " + (++attempts));
        System.out.println("attempts : " + (++attempts));


            // - Buat variabel 'lives' dimulai dari 3
        int lives = 3;

            // - Simulasikan kehilangan nyawa dalam game dengan decrement 'lives'
            // Print "Lives remaining: " + lives setelah setiap decrement
        System.out.println("Live remaining: " + (--lives));
        System.out.println("Live remaining: " + (--lives));
        System.out.println("Live remaining: " + (--lives));

            // Latihan 7: Loop counters dengan increment/decrement
            // - Gunakan while loop yang berjalan 5 kali menggunakan post-increment
            // Buat variabel 'i' dimulai dari 1, kondisi: i <= 5, increment: i++
            // Print loop counter setiap iterasi
        int i = 1;
        while(i <= 5) {
            System.out.println("Loop counter: " + i);
            i++;
        }

            // - Gunakan while loop yang menghitung mundur dari 3 ke 1 menggunakan post-decrement
            // Buat variabel 'countdown' dimulai dari 3, kondisi: countdown > 0, decrement: countdown--
            // Print "Countdown: " + countdown setiap iterasi
        int countdown = 3;
        while(countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\n=== SKENARIO MENANTANG ===");

        // Latihan 8: Skenario increment/decrement kompleks
        // - Buat variabel 'value' dengan nilai awal 5
        int value = 5;

        // - Hitung dan simpan hasil dari: value++ + ++value
        // Print kedua hasil dan nilai akhir dari 'value'
        int na = value++ + ++value;
        System.out.println("result: " + na);
        System.out.println("final value: " + value);

        // - Reset value ke 5, lalu hitung: --value + value--
        // Print kedua hasil dan nilai akhir dari 'value'
        value=5;
        int na2 = --value + value--;
        System.out.println("result: " + na2);
        System.out.println("final value: " + na2);

        // - Prediksi hasilnya sebelum menjalankan dan tambahkan komentar dengan prediksi Anda

        // my prediction is that the value will be different

        // Latihan 9: Increment/Decrement dengan pemanggilan method
        // - Buat variabel 'score' dengan nilai 10
        int score = 10;

        int max1 = Math.max(++score, 12);
        // - Print hasil dari Math.max(++score, 12)
        // Kemudian print nilai score saat ini
        System.out.println("Math.max(++score, 12) = " + max1);
        System.out.println("current score = " + score);

        // - Reset score ke 10, lalu print hasil dari Math.max(score++, 12)
        // Kemudian print nilai score saat ini
        score = 10;
        int max2 = Math.max(score++, 12);
        System.out.println("Math.max(score++, 12) = " + max2);
        System.out.println("score now = " + score);

        // - Komentari perbedaan perilaku yang Anda amati
        //diff value
    }
}

