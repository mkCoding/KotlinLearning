package com.example.kotlinlearning.basics

fun main(){
    //Mutable vs immutable list
    //Immutable - can not add or remove items
    var school = listOf("mackerel", "trout", "halibut") //you can't add/remove elements from this list

    //Mutable - can not add or remove items from this list
    var myList = mutableListOf("tuna","salmon","shark") //you can add/remove elements from mutableList

    println(myList.remove("shark"))

    //Arrays are fixed in length and you can not add/remove from them
    val mixArray = arrayOf("phone", 58, "door", "car")

    val numbers = intArrayOf(1, 2, 3) //creates int array
    val oceans = listOf("Atlantic", "Pacific")

    //Arrays can also have mixed types
    val oddList = listOf(numbers, oceans, "salmon") //create mixed array where some elements are array and list
    println(oddList)

    val array = Array (5) { it * 2 } //it represents currrent element in list
    println(java.util.Arrays.toString(array))


    //For loop for printing element within the list
    val school2 = listOf("middle", "elementary","high")
    for(item in school2){
        println("$item ")
    }

    //Looping through elements and index at same time
    for((index, element) in school2.withIndex()){
        println("The value at $index is $element")
    }

    //Ranges loops - display numbers in a range of numbers
   for(i in 1..100){
    print("$i ")
   }

    println()
    for(i in 'a'..'z'){ //using range of letters
        print("$i ") //print all letters of alphabet
    }

    println()
    for(i in 5 downTo 1 step 2){ //skip every other number and print it backwards
        print("$i")
    }

}