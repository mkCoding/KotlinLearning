package com.example.kotlinlearning.functions

fun main() {
    swim()
    println( shouldWeChangeTheWater("Monday", 30, 40))
    println(isTooHot(60))
    println(isSunday("Friday"))
    println(isAdult(20))

}

//passing default params in functions makes the param optional
fun swim(speed: String = "fast") {
    println("Swimming $speed")
}

//Required params are params that don't have defaults (day)
fun shouldWeChangeTheWater(day:String, temperature:Int = 70, dirty:Int = 30):Boolean{
    return when{
        day == "Sunday" -> true
        temperature > 60 -> true
        dirty <35 -> false
        else -> false
    }
}

//compact functions: functions return the result of a single expression
fun isTooHot(temperature: Int) = temperature > 30 //the return is a single expression
fun isSunday(day: String) = day == "Sunday" //single expression
fun isAdult(age:Int): Boolean = age >= 18



