package org.example.model

import java.time.LocalDate
import java.util.UUID

data class Peminjaman(
    val id: String = UUID.randomUUID().toString().take(8),
    val itemId: String,
    val anggotaId: String,
    val tanggalPeminjaman: LocalDate = LocalDate.now(),
    var tanggalKembali: LocalDate? = null
){
    val sedangDipinjam: Boolean get() = tanggalKembali == null
}