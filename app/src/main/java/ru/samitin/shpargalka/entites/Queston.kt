package ru.samitin.shpargalka.entites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Queston(
    @PrimaryKey val queston: Int,
    @ColumnInfo val answer: Int
)
