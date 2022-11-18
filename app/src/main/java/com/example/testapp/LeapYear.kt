package com.example.testapp
import java.util.Scanner

class LeapYear(){
    fun checkLeapYear(year:Int){
        if(((year%4==0) && (year%100!=0)) || (year%400==0)){
            println("It's a Leap Year")
        }
        else{
            println("It's not a Leap Year")
        }
    }
}

fun main(){
    var leap=LeapYear()
    var s=Scanner(System.`in`)
    println("Enter Year: ")
    var year=s.nextInt()
    leap.checkLeapYear(year)

}