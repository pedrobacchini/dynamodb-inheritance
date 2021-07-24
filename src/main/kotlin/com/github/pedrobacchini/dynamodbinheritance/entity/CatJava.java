package com.github.pedrobacchini.dynamodbinheritance.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;

public class CatJava extends AnimalJava{

    public CatJava(String id, String name) {
        super(id, name);
    }

    @DynamoDBAttribute(attributeName = "type")
    public String getType() {
        return "CAT";
    }
}
