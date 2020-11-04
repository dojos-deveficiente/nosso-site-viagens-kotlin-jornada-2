package com.acme.decolar.pais

fun NovoPaisRequest.toModel(): Pais {
    return Pais(
        nome = this.nome
    )
}