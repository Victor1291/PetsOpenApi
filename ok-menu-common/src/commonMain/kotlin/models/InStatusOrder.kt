package ru.otus.otuskotlin.models

enum class InStatusOrder(val value: String) {
    NONE(""),
    PLACED("placed"),
    APPROVED("approved"),
    DELIVERED("delivered")
}