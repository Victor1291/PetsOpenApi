package ru.otus.otuskotlin.models

enum class InStatusPet(val value: String) {
    AVAILABLE("available"),
    PENDING("pending"),
    SOLD("sold"),
    NONE("none")
}