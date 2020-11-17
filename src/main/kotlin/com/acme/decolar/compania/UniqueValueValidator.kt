package com.acme.decolar.compania

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class UniqueValueValidator:ConstraintValidator<UniqueValue, Any> {

    override fun isValid(value: Any?, context: ConstraintValidatorContext?): Boolean {
        TODO("Not yet implemented")
    }

    override fun initialize(uniquevalue: UniqueValue?) {

        this.domainClass = uniquevalue.domainClass;

    }

}
