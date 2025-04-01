package com.example.a7seta2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.security.MessageDigest

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val inputEditText: EditText = findViewById(R.id.inputEditText)
        val generateButton: Button = findViewById(R.id.generateButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Set up the Generate button's OnClickListener
        generateButton.setOnClickListener {
            val inputText = inputEditText.text.toString()
            if (inputText.isNotEmpty()) {
                val digest = generateMessageDigest(inputText)
                resultTextView.text = "SHA-256 Hash: $digest"
            } else {
                resultTextView.text = "Please enter some text!"
            }
        }
    }

    // Function to generate a SHA-256 Message Digest
    private fun generateMessageDigest(input: String): String {
        val messageDigest = MessageDigest.getInstance("SHA-256")
        val hashedBytes = messageDigest.digest(input.toByteArray())
        return hashedBytes.joinToString("") { "%02x".format(it) } // Convert to Hex
    }
}
