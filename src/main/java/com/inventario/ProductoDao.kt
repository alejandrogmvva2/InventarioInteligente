package com.inventario

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductoDao {
    @Insert
    suspend fun insert(producto: Producto)

    @Query("SELECT * FROM productos")
    suspend fun getAllProductos(): List<Producto>

    @Query("DELETE FROM productos WHERE id = :id")
    suspend fun deleteById(id: Int)
}
