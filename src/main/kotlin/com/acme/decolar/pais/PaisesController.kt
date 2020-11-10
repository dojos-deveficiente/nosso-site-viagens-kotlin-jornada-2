package com.acme.decolar.pais

import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.persistence.EntityManager
import javax.validation.Valid

@RestController
@RequestMapping("/api/admin/paises")
class PaisesController(
	val entityManager: EntityManager
) {
    
    @PostMapping
	@Transactional
    fun novoPais(
		@Valid @RequestBody novoPaisRequest: NovoPaisRequest,
		uriComponentsBuilder: UriComponentsBuilder
	): ResponseEntity<Pais> {
        val model = novoPaisRequest.toModel()
		entityManager.persist(model)
        val path = uriComponentsBuilder.path("/api/admin/paises/${model.id}").build()
        return ResponseEntity.created(path.toUri()).build();
    }
}