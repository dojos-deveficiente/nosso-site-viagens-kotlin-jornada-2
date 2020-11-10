package com.acme.decolar.compania

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/admin/companias")
class CompaniaController {

    @PostMapping
    fun novaCompania(@RequestBody companiaRequest:NovaCompaniaRequest): ResponseEntity<Void> {
        return ResponseEntity.ok().build()
    }
}
