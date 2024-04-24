package com.example.kotlinlearning.basics

//Compare Conditions and Booleans

fun main() {
    //Conditional statements
    val numberOfFish = 50
    val numberOfPlants = 23

    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    //Conditions can also be used for checking between range
    val age = 50
    if(age in 1..60){
        println("You're still young")
    }

    var placeInLine = 60
    if(placeInLine in 1..20){
        println("You are number $placeInLine we will ge to you soon")
    }else if(placeInLine in 20..70){
        println("You are number $placeInLine, come back tomorrow")
    }


    //when conditional statement is a nicer way of writing multiple if else conditionals
    val x = 50
    when(x){
        0-> println("Your gas tank is empty")
        in 1..30-> println("You have enough to get by")
        in 30..40 -> println("You have a substantial amount")
        in 40..70 -> println("You'll be fine")
        in 70..100 -> println("You have a full tank")
    }


}