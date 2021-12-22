package com.vt_shabanoff.petsapp.data

import androidx.lifecycle.MutableLiveData
import com.vt_shabanoff.petsapp.domen.Person
import com.vt_shabanoff.petsapp.domen.Pet
import com.vt_shabanoff.petsapp.domen.interfaces.PetRepository
import kotlin.random.Random

object ServerRepository: PetRepository {
    private val _petList = MutableLiveData<List<Pet>>()
    private val petList = mutableListOf<Pet>()

    override fun registrationPerson(): Person {
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
                    listOf(),
                    Random.nextLong()
                )
            ),
            1234567890
        )
    }

    override fun addPet(pet: Pet){
        petList.add(pet)
        updatePetList()
    }

    override fun deletePet(pet: Pet) {
        petList.remove(pet)
        updatePetList()
    }

    override fun addPetToFavorite() {
        TODO("Not yet implemented")
    }

    override fun getItemPetFromId(itemId: Long): Pet {
        return petList.find { pet ->
            pet.id == itemId
        } ?: throw RuntimeException("Element with id $itemId is not found")
    }

    private fun updatePetList(){
        _petList.postValue(petList)
    }
}