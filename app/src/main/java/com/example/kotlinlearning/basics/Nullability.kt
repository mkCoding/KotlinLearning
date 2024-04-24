package com.example.kotlinlearning.basics

fun main(){
    //Nullability - nullable vs non-nullable variables
    var rocks:Int = 8  //this variable will never be null
    var rivers:Int? = null //this variable is nullable (this variable can be null or non-null)


    //Nullability - nullable vs non-nullable list
    var myList:List<String> = listOf("dinosaur","mouse","cat") //list and elements can never be null
    var myList2:List<String>? = null //Only the list can be null
    var myList3:List<String?>? = listOf(null, null, null) //both the list and elements can be null

    println(myList3?.get(0))

    //Testing for null with the '?'
    var fishFoodTreats:Int? = 6
    println(fishFoodTreats?.dec()) //if fishFoodTreats is not null decrease by 1

    //elvis operator for null conditional
    println(fishFoodTreats?.dec()?:0) //if fishFoodTreats is not null decreate by 1 else print 0

    //double bang operator !! - throws NPE if value is null

    val x:String? = null
    println(x!!.length) //double bang will throw a null pointer exception if value of variable is null

}