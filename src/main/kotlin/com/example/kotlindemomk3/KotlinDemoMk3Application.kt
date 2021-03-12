package com.example.kotlindemomk3

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class KotlinDemoMk3Application

fun main(args: Array<String>) {
    runApplication<KotlinDemoMk3Application>(*args)
}
