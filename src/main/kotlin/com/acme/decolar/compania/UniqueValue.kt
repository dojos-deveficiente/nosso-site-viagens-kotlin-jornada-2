package com.acme.decolar.compania

import kotlin.reflect.KClass

annotation class UniqueValue<T : Any>(val domainClass: KClass<T>, val field: String)
