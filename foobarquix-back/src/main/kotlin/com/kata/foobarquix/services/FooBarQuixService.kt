package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    private val encodings = mapOf(3 to "Foo", 5 to "Bar", 7 to "Quix")

    fun convertNumber(inputNumber: Int): String {
        val output = StringBuilder()

        val inputAsString: String = inputNumber.toString()

        for (key in encodings.keys) {
            if (inputNumber % key == 0 && key != 7) {
                output.append(encodings[key])
            }
        }

        for (element in inputAsString) {
            val digitAsString = element.toString()
            val key = Integer.valueOf(digitAsString)
            if (encodings.keys.contains(key)) {
                output.append(encodings[key])
            }
        }

        return output.toString().ifEmpty {
            inputNumber.toString()
        }

    }

}