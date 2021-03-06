package com.reactnativewithkotlin.nativeapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.reactnativewithkotlin.R

class MainActivity : BaseActivity(0) {
//    private lateinit var mAuth: FirebaseAuth
    private lateinit var exitBtn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()

        exitBtn.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

//        mAuth.addAuthStateListener {
//            if(it.currentUser == null){
//                startActivity(Intent(this, LoginActivity::class.java))
//                finish()
//            }
//        }
    }

    private fun init () {
        setContentView(R.layout.activity_home)
        setupBottomNavigation()
//        mAuth = FirebaseAuth.getInstance()
        exitBtn = findViewById(R.id.logout)
    }

    override fun onStart() {
        super.onStart()
//        if (mAuth.currentUser == null){
//            startActivity(Intent(this, LoginActivity::class.java))
//            finish()
//        }
    }
}