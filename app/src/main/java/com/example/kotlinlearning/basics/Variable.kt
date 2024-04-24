package com.example.kotlinlearning.basics

fun main() {

    //Casting - Assign values of different types
    val i: Short = 6
    val b: Int = i.toInt() //cast from short int
    println(b)

    //=====underscores are allowed in variable values to make them more readable====
    val ssn = 111_384_4849
    var phoneNumber = 404_857_8585

    /*=========val vs var===============
        val: immutable
        var: mutable
     */
    val birthdate = "11/20/1977" //birthdate will never change
    //birthdate = "10/20/1900" --> // compilation error as val is immutable

    var height = " 5' 9\"" //height changes over time
    height = "6' 3\""      //successful compilation as var is mutable
    println(height)


    //string templates are used to replace the text representing the value (variable interpolation)
    val name: String = "Mike"
    println("My name is $name")

    //string templates can also hold results of an expression
    val num1 = 7
    val num2 = 80

    println("The sum of the 2 numbers is ${num1 + num2}")


    //Compare conditions and booleans

}