package com.vt_shabanoff.petsapp.domen

import android.media.Image

class RegistrationPersonUseCase() {
    fun registrationPerson(): Person{
        return Person(
            "1",
            "aaa",
            "bbbb",
            "male",
            30,
            "8988888888",
            "",
            "",
            listOf(
                Pet(
                    "111",
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