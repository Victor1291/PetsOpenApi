package ru.otus.otuskotlin.models

data class InOrder(
    var id: Long = 0L,
    var petId: Long = 0L,
    var quantity: Int = 0,
    var shipDate: String = "",
    var status: InStatusOrder = InStatusOrder.NONE,
    var complete: Boolean = false
)
