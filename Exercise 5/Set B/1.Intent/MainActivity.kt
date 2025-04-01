package com.example.setb1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button by ID
        val sendButton: Button = findViewById(R.id.sendButton)

        // Set OnClickListener
        sendButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello")
            startActivity(intent)
        }
    }
}
