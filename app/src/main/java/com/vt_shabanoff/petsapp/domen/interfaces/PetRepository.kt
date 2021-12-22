package com.vt_shabanoff.petsapp.domen.interfaces

import com.vt_shabanoff.petsapp.domen.Person
import com.vt_shabanoff.petsapp.domen.Pet

interface PetRepository {
    fun registrationPerson(): Person

    fun addPet(pet: Pet)

    fun deletePet(pet: Pet)

    fun addPetToFavorite()

    fun getItemPetFromId(itemId: Long): Pet
}