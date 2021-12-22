package com.vt_shabanoff.petsapp.domen.use_cases

import com.vt_shabanoff.petsapp.domen.Person
import com.vt_shabanoff.petsapp.domen.interfaces.PetRepository

class RegistrationPersonUseCase(private val repository: PetRepository) {
    operator fun invoke(): Person {
        return repository.registrationPerson()
    }
}