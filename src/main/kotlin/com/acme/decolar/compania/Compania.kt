package com.acme.decolar.compania

import com.acme.decolar.pais.Pais
import java.time.Instant
import java.util.*
import javax.persistence.*

@Entity
class Compania(
        @Id
        val id: UUID = UUID.randomUUID(),
        @Column(unique = true)
        val nome: String,
        val dataCriacao: Instant = Instant.now(),
        @ManyToOne
        @JoinColumn(name = "pais_id")
        val pais: Pais
)