package com.acme.decolar.aeroporto

import com.acme.decolar.compania.UniqueValue
import com.acme.decolar.pais.Pais
import java.util.*
import javax.persistence.EntityManager
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class NovoAeroportoRequest(
        @field:UniqueValue(domainClass = Aeroporto::class, field = "nome")
        @field:NotBlank
        val nome: String,
        @field:NotNull
        val paisId: UUID) {
        fun toModel(manager: EntityManager): Aeroporto = Aeroporto(nome = nome, pais = manager.find(Pais::class.java,paisId))
}
