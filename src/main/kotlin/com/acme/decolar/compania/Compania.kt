package com.acme.decolar.compania

import com.acme.decolar.pais.Pais
import java.time.Instant
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Compania(
        @Id
        val id: UUID = UUID.randomUUID(),
        val nome: String,
        val dataCriacao: Instant = Instant.now(),
        @ManyToOne
        @JoinColumn(name = "pais_id")
        val pais: Pais
)