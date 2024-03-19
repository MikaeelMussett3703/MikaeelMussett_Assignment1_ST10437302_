package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<Button>(R.id.clickMeButton)

        val welcomeTextView =
            findViewById<TextView>(R.id.welcomeTextView)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

        clickMeButton?.setOnClickListener {
            welcomeTextView.text = "Welcome, ${nameEditText.text}"

        }
    }
}