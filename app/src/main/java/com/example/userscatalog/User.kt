package com.example.userscatalog

data class User (val name: String, val age: Int) {
    override fun toString(): String {
        return "$name - $age"
           }
}