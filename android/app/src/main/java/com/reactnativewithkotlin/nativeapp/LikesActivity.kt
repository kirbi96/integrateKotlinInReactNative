package com.reactnativewithkotlin.nativeapp
import android.os.Bundle
import com.reactnativewithkotlin.R

class LikesActivity : BaseActivity(3) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupBottomNavigation()
    }
}