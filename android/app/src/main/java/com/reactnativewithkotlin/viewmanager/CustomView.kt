package com.reactnativewithkotlin.viewmanager

import android.content.Context
import android.content.Intent
import android.widget.LinearLayout
import com.reactnativewithkotlin.nativeapp.MainActivity;


class CustomView(context: Context, message: String ) : LinearLayout(context) {
    private var mes: String = "NOT SET"

    init {
        mes = message
        init()
    }

    private fun init() {
        val intent = Intent(this.context, MainActivity::class.java)
        this.context.startActivity(intent)
    }

    fun setMessage (message: String){
        mes = message
    }
}