package com.acme.decolar.aeroporto

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.persistence.EntityManager
import javax.transaction.Transactional
import javax.validation.Valid

@RestController
class AeroportoController(val manager: EntityManager) {

    @PostMapping("/api/admin/aeroportos")
    @Transactional
    fun cria(@Valid @RequestBody request: NovoAeroportoRequest) {
        val novoAeroporto = request.toModel(manager);
        manager.persist(novoAeroporto)
    }

}
