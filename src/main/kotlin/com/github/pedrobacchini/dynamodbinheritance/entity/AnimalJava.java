package com.github.pedrobacchini.dynamodbinheritance.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBDocument
@DynamoDBTable(tableName = "Animal")
public abstract class AnimalJava {
    private String id;
    private String name;

    public AnimalJava(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @DynamoDBHashKey(attributeName = "id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @DynamoDBAttribute(attributeName = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
