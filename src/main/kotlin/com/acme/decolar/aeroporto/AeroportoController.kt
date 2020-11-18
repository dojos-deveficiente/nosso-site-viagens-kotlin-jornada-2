package com.acme.decolar.aeroporto

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.persistence.EntityManager
import javax.validation.Valid

@RestController
class AeroportoController(val manager: EntityManager) {

    @PostMapping("/api/admin/aeroportos")
    fun cria(@Valid @RequestBody request: NovoAeroportoRequest) {
        val novoAeroporto = request.toModel(manager);
    }

}
