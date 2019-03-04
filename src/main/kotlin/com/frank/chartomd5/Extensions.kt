package com.frank.chartomd5

import java.math.BigInteger
import java.security.MessageDigest


fun String.md5() : String {
    // 建立 MD5 的訊息摘要演算物件
    val md5 = MessageDigest.getInstance("MD5")
    // 雜湊演算字串成 ByteArray 再轉換成 BigInteger 值
    val bigInt = BigInteger(1, md5.digest(this.toByteArray()))

    // 回傳的值：數值轉16進位的文字，再補32個字數
    return bigInt.toString(16).padStart(32, '0')
}