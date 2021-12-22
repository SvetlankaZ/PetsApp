package com.vt_shabanoff.petsapp.domen.use_cases

import com.vt_shabanoff.petsapp.domen.Pet
import com.vt_shabanoff.petsapp.domen.interfaces.PetRepository

class GetPetFromIdUseCase(private val repository: PetRepository) {
    operator fun invoke(itemId: Long): Pet{
        return repository.getItemPetFromId(itemId)
    }
}