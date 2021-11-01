package com.vt_shabanoff.petsapp.data

import com.vt_shabanoff.petsapp.domen.Person
import com.vt_shabanoff.petsapp.domen.Pet

object ServerRepository {

    fun registrationPerson(): Person {
        return Person(
            "nik",
            "vitaly",
            "petrov",
            "male",
            30,
            "8988888888",
            "",
            "",
            listOf(
                Pet(
                    "Cat",
                    "222",
                    "333",
                    "123",
                    false,
                    3,
                    listOf()
                )
            ),
            1234567890
        )
    }
}