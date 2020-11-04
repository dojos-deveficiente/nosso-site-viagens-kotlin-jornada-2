package com.acme.decolar

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/admin/paises")
class PaisesController {

	@PostMapping
	fun novoPais(pais: PaisRequest) {

	}

}