package ru.otus.otuskotlin.models


data class Pet (
    var name: String = "",
    var photoUrls: List<String> = emptyList(),
    var id: Long = 0L,
    var category: InCategory = InCategory(),
    var tags: List<InTag> = emptyList(),
    var status: InStatusPet = InStatusPet.NONE
)

