package com.example.mykotlin

//fun main() {
////    var name = "Kotlin" // mutable
////    val myName = "John" // immutable
////    best practice use val over var
//
////    val name: String = "James"
//
////    val myName: String
////    val age: Int
////    val myByte: Byte
////    val myShort: Short
////    myShort = 128
////    myByte = 127
////
////    print(myShort)
//
////    myName = "James" // String
////    age = 21 // Integer
//
////    print("Hello my name is $myName. I'm $age years old.")
//
////    val onLong = 1L
////
////    val pi = 3.14 // double
////    val pie = 3.14f // float
//}


fun main() {
    /*
    If amount is equal to 1000, then you are wealthy, else you are getting by just fine.
     */
//    val amount = 1000
//    if(amount >= 1000){
//        print("wow... you are very wealthy!")
//    }
//    else {
//        print("You are getting by")
//    }
//    when(amount) {
//        100 -> print("You have 100")
//        125 -> print("You are getting there...")
//        999 -> print("Really close")
//        1000 -> print("Rich but not there...")
//        1100 -> print("You've made it!")
//        else -> {
//            print("$amount is just not going to work")

//    when(amount) {
//        in 1..100 -> print("This amount is between 1 and 100")
//        !in 10..90 -> print("This amount is outside the range")
//        999 -> print("Really close")
//        1000 -> print("Rich but not there...")
//        1100 -> print("You've made it!")
//        else -> {
//            print("$amount is just not going to work")
//        }
//
//    }

    for (i in 1..1000) {
        if (i % 3 == 0) println("$i is a multiple of 3") else println("---")
    }
}
