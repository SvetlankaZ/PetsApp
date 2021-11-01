package com.vt_shabanoff.petsapp.domen

import android.media.Image

data class Person(
    val nickname: String,
    val FirstName: String,
    val LastName: String,
    val sex: String,
    val age: Int,
    val phoneNumber: String,
    val emailAddress: String = "",
    val avatar: String,// надо подумать с типом, загрузить фотку или сфоткаться
    var pets: List<Pet>,
    val id: Long
)
