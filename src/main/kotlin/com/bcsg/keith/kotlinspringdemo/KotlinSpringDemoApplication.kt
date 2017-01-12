package com.bcsg.keith.kotlinspringdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinSpringDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringDemoApplication::class.java, *args)
}
