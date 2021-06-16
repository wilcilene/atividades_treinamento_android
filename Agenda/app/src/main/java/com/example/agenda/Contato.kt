package com.example.agenda

open class Contato (private val nome: String,
                    private val celular: String) {

    open fun getNome(): String {
        return nome
    }

    open fun getCelular(): String {
        return celular
    }
}