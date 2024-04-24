package com.example.kotlinlearning.functions

import kotlin.math.absoluteValue
import kotlin.random.Random

/*  How to use default values and compact functions
    How to apply filters for lists
    How to create basic lambdas and higher-order functions

 */

fun main(){
    //use the value of an expression in a string template
    val temperature = 10
    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
    println(message)

    //how to return back a random number
    var random = Random.nextInt(100) //get random number between 1 and 100
    println(random.absoluteValue)

    //how to return random string among values in array/list
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println(week[Random.nextInt(week.size)]) //return random string/day among an array


}