package com.github.pedrobacchini.dynamodbinheritance.entity

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable

@DynamoDBTable(tableName = "Animal")
data class Animal(

    @DynamoDBHashKey(attributeName = "id")
    var id: String = "",

    @DynamoDBAttribute(attributeName = "name")
    var name: String = ""
)