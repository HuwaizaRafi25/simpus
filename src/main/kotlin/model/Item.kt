package org.example.model

abstract class Item(
    val id: String,
    val judul: String,
    val tahunTerbit: Int
) {
    var tersedia: Boolean = true
        protected set

    /** Setiap subclass WAJIB mengimplementasikan */
    abstract fun deskripsi(): String

    fun tandaiPinjam(){
        require(tersedia) {"Item '$judul' sedang tidak tersedia."}
        tersedia = false
    }

    fun tandaiDikembalikan(){
        tersedia = true
    }

    override fun toString(): String = deskripsi()
}