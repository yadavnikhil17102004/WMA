package com.example.a7seta1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val inputEditText: EditText = findViewById(R.id.inputEditText)
        val shiftEditText: EditText = findViewById(R.id.shiftEditText)
        val encryptButton: Button = findViewById(R.id.encryptButton)
        val decryptButton: Button = findViewById(R.id.decryptButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Set up the Encrypt button
        encryptButton.setOnClickListener {
            val text = inputEditText.text.toString()
            val shift = shiftEditText.text.toString().toIntOrNull() ?: 0
            val encryptedText = encryptText(text, shift)
            resultTextView.text = "Encrypted: $encryptedText"
        }

        // Set up the Decrypt button
        decryptButton.setOnClickListener {
            val encryptedText = resultTextView.text.toString().removePrefix("Encrypted: ")
            val shift = shiftEditText.text.toString().toIntOrNull() ?: 0
            val decryptedText = decryptText(encryptedText, shift)
            resultTextView.text = "Decrypted: $decryptedText"
        }
    }

    // Encryption Function (Caesar Cipher)
    private fun encryptText(input: String, shift: Int): String {
        return input.map {
            if (it.isLetter()) {
                val base = if (it.isLowerCase()) 'a' else 'A'
                (((it - base + shift) % 26) + base.code).toChar()
            } else {
                it
            }
        }.joinToString("")
    }

    // Decryption Function (Reverse Caesar Cipher)
    private fun decryptText(input: String, shift: Int): String {
        return input.map {
            if (it.isLetter()) {
                val base = if (it.isLowerCase()) 'a' else 'A'
                (((it - base - shift + 26) % 26) + base.code).toChar()
            } else {
                it
            }
        }.joinToString("")
    }
}
