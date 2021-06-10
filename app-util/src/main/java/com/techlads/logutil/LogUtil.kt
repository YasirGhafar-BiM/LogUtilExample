package com.techlads.logutil

import android.util.Log

object LogUtil {

    fun LogD(tag: String?, message: String) {
        Log.d(tag, message)
    }

    fun LogE(tag: String?, message: String) {
        Log.e(tag, message)
    }

    fun LogI(tag: String?, message: String) {
        Log.i(tag, message)
    }

    fun LogW(tag: String?, message: String) {
        Log.w(tag, message)
    }

}