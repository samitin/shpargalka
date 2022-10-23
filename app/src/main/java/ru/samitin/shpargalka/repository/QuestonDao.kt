package ru.samitin.shpargalka.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import ru.samitin.shpargalka.entites.Queston

@Dao
interface QuestonDao {
    @Query("SELECT * FROM Queston")
    fun getAll(): List<Queston>

    @Query("SELECT * FROM Queston WHERE queston IN (:quistonId)")
    fun getAnswer(quistonId: Int): Queston

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): User
    @Insert
    fun insertAll(vararg queston: Queston)
    @Delete
    fun delete(user: User)

}