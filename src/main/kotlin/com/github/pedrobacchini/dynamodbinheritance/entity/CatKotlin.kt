package com.github.pedrobacchini.dynamodbinheritance.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute

class CatKotlin(
    id: String,
    name: String,
    @DynamoDBAttribute(attributeName = "type")
    val type: String = "CAT"
) : AnimalKotlin(id, name)