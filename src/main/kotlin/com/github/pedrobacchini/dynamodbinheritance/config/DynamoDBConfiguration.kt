package com.github.pedrobacchini.dynamodbinheritance.config

import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.TableNameOverride
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class DynamoDBConfiguration {

    @Value("\${amazon.dynamodb.endpoint}")
    private lateinit var amazonDynamoDBEndpoint: String

    @Value("\${amazon.region}")
    private lateinit var amazonRegion: String

    private fun endpointConfiguration() = EndpointConfiguration(amazonDynamoDBEndpoint, amazonRegion)

    @Bean("amazonDynamoDB")
    @Profile("!prod")
    fun amazonDynamoDBLocal() =
        DynamoDBMapper(
            AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(endpointConfiguration())
                .build()
        )

    @Bean("amazonDynamoDB")
    @Profile("prod")
    fun amazonDynamoDBProduction() =
        DynamoDBMapper(AmazonDynamoDBClientBuilder.standard().build())
}