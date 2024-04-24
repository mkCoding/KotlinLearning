package com.example.kotlinlearning.functions

fun main(){
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    //filter only returns certain elements that fufil the predicatte/condition
    println(decorations.filter { it[0] == 'p' })    //print only elements that begin with letter 'p'

    // eager filter creates a new list (default filter)
    println(decorations.filter { it[0] == 'a' })

    //lazy waits for the list to evalutate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("$filtered")




}