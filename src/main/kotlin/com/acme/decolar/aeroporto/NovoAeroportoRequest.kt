package com.acme.decolar.aeroporto

import com.acme.decolar.compania.UniqueValue
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class NovoAeroportoRequest(
        @field:UniqueValue(domainClass = Aeroporto::class, field = "nome")
        @field:NotBlank
        val nome: String,
        @field:NotNull
        val paisId: UUID) {

}
