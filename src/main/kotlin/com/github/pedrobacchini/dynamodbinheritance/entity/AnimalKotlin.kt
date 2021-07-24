package com.github.pedrobacchini.dynamodbinheritance.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable

@DynamoDBDocument
@DynamoDBTable(tableName = "Animal")
abstract class AnimalKotlin(

    @DynamoDBHashKey(attributeName = "id")
    val id: String,

    @DynamoDBAttribute(attributeName = "name")
    val name: String
)