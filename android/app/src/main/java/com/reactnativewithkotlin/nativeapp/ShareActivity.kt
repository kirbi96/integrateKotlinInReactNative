package com.reactnativewithkotlin.nativeapp
import com.reactnativewithkotlin.R
import android.os.Bundle

class ShareActivity : BaseActivity(2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupBottomNavigation()
    }
}