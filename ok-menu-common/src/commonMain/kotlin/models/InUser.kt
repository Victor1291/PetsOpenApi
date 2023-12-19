package ru.otus.otuskotlin.models

data class InUser(
    var id: Long? = 0,
    var username: String = "",
    var firstName: String = "",
    var lastName: String = "",
    var email: String = "",
    var password: String = "",
    var phone: String = "",
    var userStatus: Int = 0
)