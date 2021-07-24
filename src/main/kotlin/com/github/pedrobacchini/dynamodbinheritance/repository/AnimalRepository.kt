package com.github.pedrobacchini.dynamodbinheritance.repository

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.github.pedrobacchini.dynamodbinheritance.entity.Animal
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Repository

@Repository
class AnimalRepository(
    val dynamoDBMapper: DynamoDBMapper
) {

    companion object {
        private const val SkIndex = "SkIndex"
    }

    private val logger: Logger = LoggerFactory.getLogger(AnimalRepository::class.java)

    fun save(animal: Animal) {

        logger.info("Starting process to save a animal with name:[{}]", animal.name)

        dynamoDBMapper.save(animal)

        logger.info("Done process to save a animal with name:[{}]", animal.name)
    }
}