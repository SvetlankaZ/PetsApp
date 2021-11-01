package com.vt_shabanoff.petsapp.domen

import android.media.Image

data class Pet(
    val animalFamily: String,
    val breed: String,
    val sex: String,
    val name: String,
    val passport: Boolean,
    val countMating: Int,
    val photoPets: List<Image>
)
