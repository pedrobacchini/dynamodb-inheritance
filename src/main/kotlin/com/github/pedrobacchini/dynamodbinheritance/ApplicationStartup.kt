package com.github.pedrobacchini.dynamodbinheritance

import com.github.pedrobacchini.dynamodbinheritance.entity.Animal
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
        animalRepository.save(Animal(UUID.randomUUID().toString(), "Leao"))
        animalRepository.save(Animal(UUID.randomUUID().toString(), "Onça"))
        animalRepository.save(Animal(UUID.randomUUID().toString(), "Cobra"))
        animalRepository.save(Animal(UUID.randomUUID().toString(), "Gato"))
    }
}