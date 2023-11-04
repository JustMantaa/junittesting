# junittesting

Kode ini digunakan untuk mengilustrasikan pengujian unit sederhana menggunakan kerangka kerja pengujian JUnit.
Kelas Hitungan adalah kelas yang berisi satu metode bernama add. Metode ini menerima dua parameter bertipe Int, yaitu a dan b, dan mengembalikan hasil penjumlahan dari kedua parameter tersebut.
Kelas HitunganTest adalah kelas yang digunakan untuk menguji metode add yang terdapat dalam kelas Hitungan. Ini adalah sebuah kelas pengujian unit yang menggunakan kerangka kerja pengujian JUnit.

    @Test: Ini adalah sebuah anotasi yang menandai metode test sebagai metode pengujian. Metode ini akan dieksekusi ketika Anda menjalankan pengujian unit.

    val hitungan = Hitungan(): Baris ini membuat sebuah instansi dari kelas Hitungan yang akan diuji.

    val result = hitungan.add(5, 5): Baris ini memanggil metode add pada instansi hitungan dengan parameter 5 dan 5, dan hasilnya disimpan dalam variabel result.

    assertEquals(10, result, "Berhasil"): Ini adalah pernyataan pengujian. Ini membandingkan nilai yang diharapkan (10) dengan nilai yang dikembalikan oleh metode add (hasil). Jika kedua nilai tidak sama, pengujian akan gagal, dan pesan "Berhasil" akan digunakan sebagai pesan kesalahan.

Jadi, secara keseluruhan, kode ini adalah contoh pengujian unit sederhana yang menguji metode add dari kelas Hitungan untuk memastikan bahwa metode tersebut mengembalikan hasil yang benar. Jika hasilnya tidak sesuai dengan yang diharapkan, pengujian akan gagal
