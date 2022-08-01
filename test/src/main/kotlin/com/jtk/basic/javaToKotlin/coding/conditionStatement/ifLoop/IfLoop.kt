package com.jtk.basic.javaToKotlin.coding.conditionStatement.ifLoop


/*
public class Lec05Main {
public static void main(String[] args) {
}

private void validateScoreIsNotNegative(int score) {
if (score < 0) {
throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 있음)
}
}
private String getPassOrFail(int score) {
if (score >= 50) {
return "P";
} else {
return "F";
}
*/

fun validateScore(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    } else if (score !in 0..100){
        throw IllegalArgumentException("${score}는 0-100 범위 밖에 있습니다.")
        }
    }



fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

