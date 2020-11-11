package com.acme.decolar.compania

import java.util.UUID
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class NovaCompaniaRequest(@field:NotBlank val nome: String, @field:NotNull val paisId: UUID) {
    fun toModel(): Compania {
        return Compania(nome = nome)
    }
}
