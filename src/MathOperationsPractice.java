public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
       int num1 = 25;
        int num2 = 4;

        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int total = num1 + num2;


        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int total2 = num1 - num2;


        // - Hitung dan simpan hasil perkalian num1 dan num2
        int total3 = num1 * num2;

        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int total4 = num1 / num2;

        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int total5 = num1 % num2;

        // - Print semua hasil dengan label yang deskriptif
        System.out.println("total for 25 + 4: " + total);
        System.out.println("total for 25 - 4: " + total2);
        System.out.println("total for 25 * 4: " + total3);
        System.out.println("total for 25 / 4: " + total4);
        System.out.println("total for 25 mod 4: " + total5);


        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int int1 = 17;
        int int2 = 5;
        int int3 = int1 / int2;

        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        float float1 = 17.0f;
        float float2 = 5.0f;
        float float3 = float1 / float2;

        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        double double1 = int1;
        double double2 = int2;
        double double3 = double1 / double2;
        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("total of 17/5 using int: " + int3);
        System.out.println("total of 17/5 using float: " + float3);
        System.out.println("total of 17/5 using double: " + double3);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
        float l = 12.5f;
        float w = 8.3f;
        float a = l * w;

        // - Hitung keliling persegi panjang yang sama
        float p = 2 * (l + w);

        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        double pitem = 15.99;
        double q = 3;
        double tax = 0.08;

        double totax = (pitem * q) * (1 + tax);
        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25

        float cel = 25;
        float fah = (cel * 9/5) + 32f;

        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int day =50;
        int wtotal = day / 7;
        int dtotal = day % 7;

        // - Print semua kalkulasi dengan label dan format yang sesuai
        System.out.println("luas persegi panjang of L = 12.5 and W = 8.3: " + a);
        System.out.println("keliling persegi panjang of L = 12.5 and W = 8.3: " + p);
        System.out.println("total harga after tax: " + totax);
        System.out.println("celsius to fahrenheit: C 25 -> F " + fah);
        System.out.println("berapa minggu penuh dalam 50 hari: " + wtotal);
        System.out.println("berapa hari sisanya: "+dtotal);
        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        float s = 65.5f;
        float t = 2.75f;
        float d = s * t;



        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // Gunakan Math.pow() untuk perpangkatan
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
        double pokok = 1000;
        double bunga = 0.05;
        double bungatot = pokok * Math.pow((1 + bunga),3);


        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88
        float rat1 = 85;
        float rat2 = 92;
        float rat3 = 78;
        float rat4 = 96;
        float rat5 = 88;

        float avg = (rat1 + rat2 + rat3 + rat4 + rat5) / 5;


        // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())
        System.out.println("dis tance for s = 65.5 km/h and " + d);
        System.out.println(" bunga majemuk: " + bungatot);
        System.out.println("average grade of exam: " +avg);

    }
}

