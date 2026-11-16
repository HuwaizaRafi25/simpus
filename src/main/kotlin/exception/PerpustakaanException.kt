package org.example.exception

sealed class PerpustakaanException(message: String) : Exception(message)

class ItemTidakDitemukanException(id: String) :
        PerpustakaanException("Item dengan id '$id' tidak ditemukan.")

class AnggotaTidakDitemukanException(id: String) :
        PerpustakaanException("Anggota dengan id '$id' tidak ditemukan.")

class ItemTidakTersediaException(id: String) :
        PerpustakaanException("Item dengan id '$id' sedang tidak tersedeia.")

class DuplikasiIdException(id: String) :
        PerpustakaanException("ID '$id' sudah terdaftar")

class PeminjamanTidakDitemukanException(id: String) :
        PerpustakaanException("Peminjaman aktif dengan id '$id' tidak ditemukan.")

class InputTidakValidException(pesan: String) :
        PerpustakaanException(pesan)