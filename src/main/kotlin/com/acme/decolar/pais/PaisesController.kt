package com.acme.decolar.pais

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping("/api/admin/paises")
class PaisesController {

	@PostMapping
	fun novoPais(@Valid @RequestBody novoPaisRequest: NovoPaisRequest,
	             uriComponentsBuilder: UriComponentsBuilder ): ResponseEntity<Pais> {

		val model = novoPaisRequest.toModel()

		val path = uriComponentsBuilder.path("/api/admin/paises/${model.id}").build()

		return ResponseEntity.created(path.toUri()).build();
	}

}
