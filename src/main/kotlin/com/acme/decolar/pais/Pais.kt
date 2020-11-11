package com.acme.decolar.pais

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Pais(
    @Id
    val id: UUID = UUID.randomUUID(),
    val nome: String
)
