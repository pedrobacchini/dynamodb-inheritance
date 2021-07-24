package com.github.pedrobacchini.dynamodbinheritance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DynamodbInheritanceApplication

fun main(args: Array<String>) {
	runApplication<DynamodbInheritanceApplication>(*args)
}
