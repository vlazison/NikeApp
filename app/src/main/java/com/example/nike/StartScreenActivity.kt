package com.example.nike

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartScreenActivity : AppCompatActivity() {
    class StartScreenClass{
        companion object{
            var activity: Activity? = null
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)
        StartScreenClass.activity = this@StartScreenActivity
    }

    fun goToLogin(view: View) {
        val changePage = Intent(this@StartScreenActivity, LoginScreenActivity::class.java)
        startActivity(changePage)
        SplashScreenActivity.SplashScreenClass.activity?.finish()
    }
}