package com.example.kotlinlearning.challenges


import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test

import java.text.SimpleDateFormat
import java.util.Date

fun main(){

    //Challenge 1
    verifyCardNumbers("1121-0000-0000-0312")

    //Challenge 2
    findLongestWord("Find the longest word in this string while ignoring punctuation. There are multiple methods for achieving this.")

    //Challenge 3
    moveZeros(listOf(1, 2, 5, 0, 5, 7, 3, 0, 1, 0, 14, 35, 0, 65))


    //Lambada solution for Challenge 2 - Just practice
//    val sentence = "The quick brown fox jumps over the lazy dinosaur!!!".replace(Regex("[^A-Za-z ]"),"")
//    val sentenceArray = sentence.split(" ")
//    val longestWord = sentenceArray.maxBy { it -> it.length}
//    println(longestWord)

    //Lambada solution Challenge 3 - Just practice
//    val testList = mutableListOf(1, 2, 5, 0, 5, 7, 3, 0, 1, 0, 14, 35, 0, 65)
//    val resultList = testList.filter { it -> it != 0 } + testList.filter{it ==  0}
//    println(resultList)


}

/*
challenge 1

Bank Cards/
  Banks
  ACME 1121
  ALFA 1111
  AMEX 3796

  Sample input
  -> 1121-0000-0000-0312  -- Expiry Date (03/12)
  -> First 4 digit represent company
  -> Last 4 digit represent expiry date

 Assuming card and date as input write a function to verify valid card numbers
  */

fun verifyCardNumbers(cardNumber:String): Boolean{
    /*
       for validity we need to verify that:
        - the card number is associated with a valid bank
        - the card number has not gone past expiration date
     */

    //initialize boolean variables to keep track of card validity
    var isValidBank = false
    var isValidDate = false
    var isCardFullyValid = false

    //create map with key value pairs for each bank (Bank Name, Bank Number)
    val banksMap = mapOf(
        Pair("ACME",1121),
        Pair("ALFA",1111),
        Pair("AMEX", 3709)
    )

    //split every section to array split by '-'
    var cardNumSplit = cardNumber.split('-')

    //for every element/item in the map
    for(item in banksMap){
        //check if first 4 digits of card number is equal to element value in the banksMap
        if(item.value == cardNumSplit[0].toInt()){
            isValidBank = true //set valid bank to true
        }
    }

    //I used a custom extension function to check if date is a valid date
    if(cardNumSplit[3].isValidDate()){
        isValidDate = true
    }

    //if after the card is checked both bank and date is valid is valid then I set isCardFullyValid to true
    if(isValidBank && isValidDate){
        //Card is valid
        isCardFullyValid = true
    }

    return  isCardFullyValid
}

//Adding extension function for above code
fun String.isValidDate(): Boolean {
    var isValid = false
    val dateFormat = SimpleDateFormat("MMYY")

    //if date entered is after current date then it is valid
    if(dateFormat.parse(this).after(Date())){
       isValid = true
    }

    return isValid
}


//Challenge 2
/**
 * Given a string implement a function which returns longest word in that string.
 * If there are two or more words that have the same length, return the first longest word from the string.
 * Ignore punctuation. Input string can't be empty or blank string.
 */

fun findLongestWord(value: String): String {

    val removePunctuations = value.replace(Regex("[^A-Za-z ]"),"")
    val splitWordsArray = removePunctuations.split(" ")
    var longestWord = splitWordsArray[0]


    if(value.isNotBlank() || value.isNotEmpty()){
    for(item in splitWordsArray){
        //if current word length is greater than the current longest word
        if(item.length > longestWord.length){
            //then set the longest word to the current word
            longestWord = item
        }
    }
    }

    //print(longestWord)
    return longestWord

}


//challenge 3
// For a given list, return a new list with all the zero values moved to the end of the list.
fun moveZeros(list: List<Int>): List<Int> {

    //create a result list to return
    val resultList = mutableListOf<Int>()

    //keep track of the total number of 0s in the list
    var zeroCount = 0;

    //iterate through every element in the list
    for (item in list){
        //if current element is not equal to zero add it to the list
        if (item != 0){
            resultList.add(item)
        }else{
            //if a zero is detected increment the count by 1
            zeroCount +=1
        }

    }

    //for every count of zero recorded add it to the end of the list
    for(i in 1..zeroCount){
        resultList.add(0)
    }

    println(resultList)

return resultList //return the result list
}

class MainTest {
    @Test
    fun longListHasZerosMovedToTheEndTest() {
        val testValue = moveZeros(listOf(1, 2, 5, 0, 5, 7, 3, 0, 1, 0, 14, 35, 0, 65))
        assertEquals(listOf(1, 2, 5, 5, 7, 3, 1, 14, 35, 65, 0, 0, 0, 0), moveZeros(testValue))
    }

    @Test
    fun longestWordInPunctuationTest() {
        val testSentence = "Find the longest word in this string while ignoring punctuation. " +
                "There are multiple methods for achieving this."
        Assert.assertEquals("punctuation", findLongestWord(testSentence))
    }
}

