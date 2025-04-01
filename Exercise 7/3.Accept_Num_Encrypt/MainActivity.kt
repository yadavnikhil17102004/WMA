package com.example.a7seta3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey

class MainActivity : AppCompatActivity() {
    private lateinit var secretKey: SecretKey

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val mobileNumberEditText: EditText = findViewById(R.id.mobileNumberEditText)
        val encryptButton: Button = findViewById(R.id.encryptButton)
        val decryptButton: Button = findViewById(R.id.decryptButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Generate a secret key
        secretKey = generateSecretKey()

        // Set up the Encrypt button
        encryptButton.setOnClickListener {
            val mobileNumber = mobileNumberEditText.text.toString()
            if (mobileNumber.isNotEmpty()) {
                val encryptedText = encryptText(mobileNumber, secretKey)
                resultTextView.text = "Encrypted: $encryptedText"
            } else {
                resultTextView.text = "Please enter a mobile number!"
            }
        }

        // Set up the Decrypt button
        decryptButton.setOnClickListener {
            val encryptedText = resultTextView.text.toString().removePrefix("Encrypted: ")
            if (encryptedText.isNotEmpty()) {
                val decryptedText = decryptText(encryptedText, secretKey)
                resultTextView.text = "Decrypted: $decryptedText"
            } else {
                resultTextView.text = "No encrypted message to decrypt!"
            }
        }
    }

    // Generate AES Secret Key
    private fun generateSecretKey(): SecretKey {
        val keyGenerator = KeyGenerator.getInstance("AES")
        keyGenerator.init(128) // AES-128
        return keyGenerator.generateKey()
    }

    // Encrypt the Text
    @SuppressLint("GetInstance")
    private fun encryptText(input: String, key: SecretKey): String {
        val cipher = Cipher.getInstance("AES")
        cipher.init(Cipher.ENCRYPT_MODE, key)
        val encryptedBytes = cipher.doFinal(input.toByteArray())
        return Base64.getEncoder().encodeToString(encryptedBytes) // Convert to Base64 string
    }

    // Decrypt the Text
    @SuppressLint("GetInstance")
    private fun decryptText(input: String, key: SecretKey): String {
        val cipher = Cipher.getInstance("AES")
        cipher.init(Cipher.DECRYPT_MODE, key)
        val decodedBytes = Base64.getDecoder().decode(input)
        val decryptedBytes = cipher.doFinal(decodedBytes)
        return String(decryptedBytes)
    }
}
