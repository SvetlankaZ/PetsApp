package com.vt_shabanoff.petsapp.domen.use_cases

import com.vt_shabanoff.petsapp.domen.Pet
import com.vt_shabanoff.petsapp.domen.interfaces.PetRepository

class DeletePetUseCase(private val repository: PetRepository) {
    operator fun invoke(pet: Pet){
        repository.deletePet(pet)
    }
}