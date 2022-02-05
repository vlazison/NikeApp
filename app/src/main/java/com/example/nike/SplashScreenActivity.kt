package com.example.nike

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashScreenActivity : AppCompatActivity() {
    class SplashScreenClass{
        companion object{
            var activity: Activity? = null
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        SplashScreenClass.activity = this@SplashScreenActivity
        val timer = object : CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }
            override fun onFinish() {
                val changePage = Intent(this@SplashScreenActivity, StartScreenActivity::class.java)
                startActivity(changePage)
            }
        }
        timer.start()
    }
}