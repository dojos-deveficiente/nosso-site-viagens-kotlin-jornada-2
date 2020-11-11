package com.acme.decolar.pais

import javax.validation.constraints.NotBlank

class NovoPaisRequest(@field:NotBlank val nome: String) {

    fun toModel(): Pais {
        return Pais(
                nome = this.nome
        )
    }

}
