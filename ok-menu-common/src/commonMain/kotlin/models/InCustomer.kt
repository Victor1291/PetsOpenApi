package ru.otus.otuskotlin.models

data class InCustomer(
    var id: Long = 0L,
    var username: String = "",
    var address: List<InAddress> = emptyList()
)
