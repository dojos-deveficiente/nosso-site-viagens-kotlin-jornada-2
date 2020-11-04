package com.acme.decolar.pais

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/admin/paises")
class PaisesController {

	@PostMapping
	fun novoPais(@Valid @RequestBody novoPaisRequest: NovoPaisRequest): ResponseEntity<Pais> {
		return ResponseEntity.ok(novoPaisRequest.toModel())
	}

}
