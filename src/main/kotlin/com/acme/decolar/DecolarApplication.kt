package com.acme.decolar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DecolarApplication

fun main(args: Array<String>) {
	runApplication<DecolarApplication>(*args)
}
