package com.reactnativewithkotlin.nativeapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.reactnativewithkotlin.R

class ProfileActivity : BaseActivity(4) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setupBottomNavigation()

        val editProfileBtn = findViewById<AppCompatButton>(R.id.profile_edit_btn)

        editProfileBtn.setOnClickListener{
            val intent = Intent(this, ProfileEditActivity::class.java)
            startActivity(intent)
        }
    }
}