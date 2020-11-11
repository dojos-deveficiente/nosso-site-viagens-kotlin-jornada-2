package com.acme.decolar.pais

import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.created
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.persistence.EntityManager
import javax.validation.Valid

@RestController
@RequestMapping("/api/paises")
class PaisesController(
		val entityManager: EntityManager
) {

    @PostMapping
    @Transactional
    fun novoPais(
			@Valid @RequestBody novoPaisRequest: NovoPaisRequest,
			uriComponentsBuilder: UriComponentsBuilder
	): ResponseEntity<Unit> =
            novoPaisRequest.toModel()
                    .also { entityManager.persist(it) }
                    .let { uriComponentsBuilder.path("/api/paises/${it.id}").build() }
                    .let { created(it.toUri()).build() }

}