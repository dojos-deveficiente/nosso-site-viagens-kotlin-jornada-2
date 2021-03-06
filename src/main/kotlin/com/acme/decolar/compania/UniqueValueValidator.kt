package com.acme.decolar.compania

import javax.persistence.EntityManager
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext
import kotlin.reflect.KClass

class UniqueValueValidator(val manager: EntityManager) :ConstraintValidator<UniqueValue, Any> {

    private lateinit var domainClass: KClass<*>
    private lateinit var field: String

    override fun isValid(value: Any?, context: ConstraintValidatorContext?): Boolean {

        if (value == null) {
            return true
        }

        val resultList = manager
                .createQuery("SELECT 1 FROM ${domainClass.simpleName} WHERE ${field} = :value")
                .setParameter("value", value)
                .resultList

        assert(resultList.size <= 1)

        return resultList.isEmpty()
    }

    override fun initialize(uniquevalue: UniqueValue) {

        this.domainClass = uniquevalue.domainClass;
        this.field = uniquevalue.field

    }

}
