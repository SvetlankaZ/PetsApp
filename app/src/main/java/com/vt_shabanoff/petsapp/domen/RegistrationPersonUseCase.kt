package com.vt_shabanoff.petsapp.domen

import com.vt_shabanoff.petsapp.data.ServerRepository

class RegistrationPersonUseCase(private val serverRepository: ServerRepository) {
    fun registrationPerson(): Person{
        return serverRepository.registrationPerson()
    }
}