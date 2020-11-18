package com.acme.decolar.compania

import java.lang.annotation.Documented
import javax.validation.Constraint
import javax.validation.Payload
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.FIELD
import kotlin.reflect.KClass

@Documented
@Constraint(validatedBy = [UniqueValueValidator::class])
@Target(FIELD)
@Retention(RUNTIME)
annotation class UniqueValue(
        val domainClass: KClass<*>,
        val field: String,
        val message: String = "com.acme.decolar.shared.uniquevalue",
        val groups: Array<KClass<*>> = [],
        val payload: Array<KClass<in Payload>> = [])
