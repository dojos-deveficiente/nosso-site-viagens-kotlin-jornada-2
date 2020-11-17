package com.acme.decolar.compania

import com.acme.decolar.pais.Pais
import java.util.UUID
import javax.persistence.EntityManager
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class NovaCompaniaRequest(
        @field:NotBlank
        @field:UniqueValue(domainClass = Compania::class, field = "nome")
        val nome: String,
        @field:NotNull
        val paisId: UUID) {
    fun toModel(entityManager: EntityManager): Compania {

        return Compania(nome = nome, pais = entityManager.find(Pais::class.java, paisId))
    }
}
