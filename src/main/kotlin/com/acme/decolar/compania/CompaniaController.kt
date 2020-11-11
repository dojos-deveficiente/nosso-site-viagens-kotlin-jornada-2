package com.acme.decolar.compania

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.persistence.EntityManager
import javax.validation.Valid

@RestController
@RequestMapping("/api/admin/companias")
class CompaniaController(val entityManager: EntityManager) {

    @PostMapping
    fun novaCompania(@Valid @RequestBody novaCompaniaRequest:NovaCompaniaRequest,
                     uriComponentsBuilder: UriComponentsBuilder): ResponseEntity<Void> {
        val model = novaCompaniaRequest.toModel(entityManager)
        val path = uriComponentsBuilder.path("/api/admin/companias/${model.id}").build()

        return ResponseEntity.created(path.toUri()).build()
    }
}
