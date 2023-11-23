package com.example.myapplication

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private var calculator: Calculator? = null

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @After
    fun tearDown() {
        calculator = null
    }

    @Test
    fun calcsfhsfghsfghsfgh() {
        //Assert - exception AssertionError
        //Assume - ignored
        Assert.assertEquals(100,calculator?.calc(40,50) ?: 0)
    }

    @Test
    fun test2() {
        Assert.assertEquals(100,calculator?.calc(40,60) ?: 0)
    }

    @Test
    fun test3() {
        Assume.assumeNotNull(5,6,3,3,2,4,null)
    }

    @Test(expected = NullPointerException::class)
    fun test() {
        calculator?.getLength("null")
    }
}