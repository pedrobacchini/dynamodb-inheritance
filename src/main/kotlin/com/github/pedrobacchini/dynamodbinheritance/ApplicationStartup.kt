package com.github.pedrobacchini.dynamodbinheritance

import com.github.pedrobacchini.dynamodbinheritance.entity.CatJava
import com.github.pedrobacchini.dynamodbinheritance.entity.CatKotlin
import com.github.pedrobacchini.dynamodbinheritance.repository.AnimalRepository
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import java.util.*

@Component
class ApplicationStartup(
    private val animalRepository: AnimalRepository
) : ApplicationListener<ApplicationReadyEvent?> {

    override fun onApplicationEvent(p0: ApplicationReadyEvent) {

//        Kotlin
        animalRepository.save(CatKotlin(UUID.randomUUID().toString(), "Leao"))
        animalRepository.save(CatKotlin(UUID.randomUUID().toString(), "Onça"))
        animalRepository.save(CatKotlin(UUID.randomUUID().toString(), "Gato"))

//        Java
//        animalRepository.save(CatJava(UUID.randomUUID().toString(), "Leao"))
//        animalRepository.save(CatJava(UUID.randomUUID().toString(), "Onça"))
//        animalRepository.save(CatJava(UUID.randomUUID().toString(), "Gato"))
    }
}