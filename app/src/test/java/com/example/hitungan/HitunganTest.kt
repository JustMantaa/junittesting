package com.example.hitungan

import org.junit.Test
import kotlin.test.assertEquals

class HitunganTest {
    @Test
    fun test() {
        val hitungan = Hitungan()
        val result = hitungan.add(5, 5)
        assertEquals(10, result, "Berhasil")
    }

}