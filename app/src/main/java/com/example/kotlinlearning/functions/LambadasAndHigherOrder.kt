package com.example.kotlinlearning.functions

fun main() {

    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    println(updateDirty(30, waterFilter))


}

//Lambadas: an expression that makes a function
//waterFilter: variable name'
//Param: (Int)
//return type: INT
//{dirty -> dirty / 2}: take whats in the lambada and devide it by
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

//Higher Order Function:  Argument of 1 function is another function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

