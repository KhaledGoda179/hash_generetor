package com.example.hashgenerator

import java.security.MessageDigest

class HashLogic {
    fun getHash(plainText:String, algorith:String):String{
        val charArray = MessageDigest.getInstance(algorith).digest(plainText.toByteArray())
        return toHexa(charArray)
    }

    private fun toHexa(byteArray: ByteArray):String{
        return byteArray.joinToString {
            "%02x".format(it)
        }
    }
}