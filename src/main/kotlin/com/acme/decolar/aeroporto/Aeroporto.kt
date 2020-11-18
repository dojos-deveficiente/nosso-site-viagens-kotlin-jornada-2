package com.acme.decolar.aeroporto

import com.acme.decolar.pais.Pais
import javax.persistence.ManyToOne

class Aeroporto(val nome: String,
                @ManyToOne  val pais: Pais ) {

}
