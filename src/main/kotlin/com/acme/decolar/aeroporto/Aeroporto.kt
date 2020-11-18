package com.acme.decolar.aeroporto

import com.acme.decolar.pais.Pais
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Aeroporto(
    @Id
    val id: UUID = UUID.randomUUID(),
    val nome: String,
    @ManyToOne  val pais: Pais ) {

}
