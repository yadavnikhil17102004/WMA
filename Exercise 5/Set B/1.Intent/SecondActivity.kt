package com.example.setb1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Get the TextView by ID
        val messageView: TextView = findViewById(R.id.messageView)

        // Retrieve the message from Intent
        val message = intent.getStringExtra("EXTRA_MESSAGE")

        // Display the message
        messageView.text = message
    }
}
