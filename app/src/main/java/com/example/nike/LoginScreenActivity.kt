package com.example.nike

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LoginScreenActivity : AppCompatActivity() {
    class LoginScreenClass{
        companion object{
            var activity: Activity? = null
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        LoginScreenClass.activity = this@LoginScreenActivity
    }
    fun loginButton(view: View) {
        var email = findViewById<EditText>(R.id.login_emailField)
        var pass = findViewById<EditText>(R.id.login_passwordField)
        if (email.text.toString().isNullOrEmpty() || pass.text.toString().isNullOrEmpty()) {
            Toast.makeText(this ,"Есть незаполненные поля!", Toast.LENGTH_SHORT).show()
        } else if (email.text.toString() == "admin" && pass.text.toString() == "admin") {
            val changePage = Intent(this@LoginScreenActivity, MainScreenActivity::class.java)
            startActivity(changePage)
        } else {
            Toast.makeText(this ,"АХАХАХАХХАХАХАХХАХАХАХАХ", Toast.LENGTH_SHORT).show()
        }
    }
}