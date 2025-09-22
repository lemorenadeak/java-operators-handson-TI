public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Perbandingan
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator perbandingan dan memahami perilakunya dengan tipe data berbeda.
         */

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        // Latihan 1: Berlatih semua operator perbandingan dengan integers
        // - Buat dua variabel integer: firstNum = 25, secondNum = 18
        int firstNum=25;
        int secondNum=18;

        // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("is Firstnumber greater than the second one? " + (firstNum > secondNum));

        // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("is Firstnumber greater than the second one? " + (firstNum < secondNum));
        // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("is Firstnumber greater than the second one? " + (firstNum >= secondNum));

        // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("is Firstnumber greater than the second one? " + (firstNum <= secondNum));

        // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("is Firstnumber is equal to the second one? " + (firstNum == secondNum));

        // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("is Firstnumber is equal to the second one? " + (firstNum == secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");

        // Latihan 2: Bekerja dengan perbandingan angka floating-point
        // - Buat dua variabel double: price1 = 19.99, price2 = 20.0
        double price1 = 19.99;
        double price2 = 20.0;

        // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai'
        System.out.println("is price1 cheaper than price2? " + (price1 < price2));
        System.out.println("is price2 cheaper than price1? " + (price2 < price1));

        // - Periksa apakah perbedaan antara harga kurang dari 1.0
        double diff =  price2 - price1;
        System.out.println("are the difference less than 1.0? " + (diff < 1.0));

        // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
        // Contoh: 0.1 + 0.2 dibandingkan dengan 0.3
        double sum = 0.1 + 0.2;
        double expected = 0.3;
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("Apakah 0.1 + 0.2 == 0.3? " + (sum == expected));
        System.out.println("Apakah perbedaannya sangat kecil (< 1e-9)? " + (Math.abs(sum - expected) < 1e-9));

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\n=== PERBANDINGAN KARAKTER ===");

        // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
        // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'
        char letter1= 'A';
        char letter2 = 'B';


        // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)
        System.out.println("Does A have bigger value than B? " + (letter1 > letter2));
        System.out.println("Does B have bigger value than A? " + (letter2 > letter1));
        System.out.println("this make sense since in binary code A have less binary value than B ");

        // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya
        char letter3 = 'a';
        System.out.println("Does 'a' have bigger value than 'A'? "+ (letter3 > letter1));
        // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'
        char c1 = '7';
        char c2 = 'x';

        System.out.println("is '7' a digit? " + (c1 >= '0' && c1 <= '9'));
        System.out.println("is 'x' a digit? " + (c2 >= '0' && c2 <= '9'));
        // ===== PERBANDINGAN STRING =====
        System.out.println("\n=== PERBANDINGAN STRING ===");

        // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
        // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"
        String name1 = "Java";
        String name2 = "Java";

        // - Bandingkan name1 == name2 dan print hasilnya
        System.out.println("does Jave and Java have the same value? " +(name1 == name2));

        // - Buat string lain: name3 = new String("Java")
        String name3 = new String("Java");

        // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas
        System.out.println("does Jave and Java have the same value? " +(name1 == name3));
        System.out.println(" the other java have diff value cuz name 3 have diff memory placement");

        // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar
        System.out.println("name1 equals name3 (using .equals): " + name1.equals(name3));
        // - Demonstrasikan perbandingan case-sensitive dengan .equals()
        String name4 = "java"; // lowercase
        System.out.println("name1 equals name4 (case-sensitive): " + name1.equals(name4));

        // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()
        System.out.println("name1 equals name4 (case-insensitive): " + name1.equalsIgnoreCase(name4));

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
        // - Buat variabel untuk pengecekan nilai siswa
        // grade = 85, passingGrade = 60, honorRoll = 90
        // - Periksa apakah siswa lulus menggunakan operator perbandingan

        int grade = 85;
        int passingGrade = 60;
        int honorRoll = 90;
        System.out.println("Passed? " + (grade >= passingGrade));


        // - Periksa apakah siswa memenuhi syarat untuk honor roll
        System.out.println("Honor Roll? " + (grade >= honorRoll));

        // - Buat skenario verifikasi usia
        // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21
        int age = 17;
        int drivingAge = 16;
        int votingAge = 18;
        int drinkingAge = 21;


        // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan
        System.out.println("Can drive? " + (age >= drivingAge));
        System.out.println("Can vote? " + (age >= votingAge));
        System.out.println("Can drink? " + (age >= drinkingAge));

        // Latihan 6: Skenario shopping dan discount
        // - Buat variabel untuk skenario belanja
        // originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60
        int originalPrice = 100;
        int discountThreshold = 50;
        int customerAge = 65;
        int seniorAge = 60;

        // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)
        boolean bulkDiscount = originalPrice > discountThreshold;
        System.out.println("Bulk discount eligible? " + bulkDiscount);

        // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior
        boolean seniorDiscount = customerAge >= seniorAge;
        System.out.println("Senior discount eligible? " + seniorDiscount);

        // - Gabungkan kondisi untuk menentukan kelayakan akhir
        boolean finalDiscount = bulkDiscount || seniorDiscount;
        System.out.println("Final discount eligible? " + finalDiscount);

        // ===== PENGUJIAN BATAS =====
        System.out.println("\n=== PENGUJIAN BATAS ===");

        // Latihan 7: Test edge cases dan kondisi batas
        // - Buat variabel 'score' dengan nilai 100
        int score = 100;
        // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan

        // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101
        if(score >=0 || score <=100){
            System.out.println("score is valid");
        }else{
            System.out.println("score is invalid");
        }


        // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)
        int temperature = 36;
        boolean validTemp = temperature >= -10 && temperature <= 40;
        System.out.println("Temperature " + temperature + " is valid? " + validTemp);

        // Latihan 8: Rantai perbandingan dan kondisi kompleks
        // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200
        int height = 175;
        int minHeight = 160;
        int maxHeight = 200;


        // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan
        boolean validHeight = height >= minHeight && height <= maxHeight;
        System.out.println("Height " + height + " is acceptable? " + validHeight);

        // - Buat sistem penilaian menggunakan beberapa perbandingan:
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        int sgrade = 76;
        if (sgrade >= 90) {
            System.out.println("Grade: A");
        } else if (sgrade >= 80) {
            System.out.println("Grade: B");
        } else if (sgrade >= 70) {
            System.out.println("Grade: C");
        } else if (sgrade >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}

