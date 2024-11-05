package com

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class UserTest {

    @Test
    fun testIsAdult() {
        val user = User("John",20)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsAdult2() {
        val user = User("Sonia", 45)
    }

    @Test
    fun testIsTeenanger(){
        val user = User("Fernando", 17)
        assertTrue(user.isTeenanger())
    }

    @Test
    fun testIsTeenanger2(){
        val user = User("Gael", 15)
    }

    @Test
    fun testIsChild(){
        val user = User("Yael", 11)
    }

    @Test
    fun testIsChild2(){
        val user = User("Valentina", 12)
    }
}