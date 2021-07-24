package com.github.pedrobacchini.dynamodbinheritance.repository

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.github.pedrobacchini.dynamodbinheritance.entity.AnimalJava
import com.github.pedrobacchini.dynamodbinheritance.entity.AnimalKotlin
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

    fun save(animalKotlin: AnimalKotlin) {

        logger.info("Starting process to save a animal with name:[{}]", animalKotlin.name)

        dynamoDBMapper.save(animalKotlin)

        logger.info("Done process to save a animal with name:[{}]", animalKotlin.name)
    }

    fun save(animalJava: AnimalJava) {

        logger.info("Starting process to save a animal with name:[{}]", animalJava.name)

        dynamoDBMapper.save(animalJava)

        logger.info("Done process to save a animal with name:[{}]", animalJava.name)
    }
}