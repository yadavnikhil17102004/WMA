package com.example.setb4

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val number1EditText: EditText = findViewById(R.id.number1EditText)
        val number2EditText: EditText = findViewById(R.id.number2EditText)
        val swapButton: Button = findViewById(R.id.swapButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Set up the swap button's onClickListener
        swapButton.setOnClickListener {
            val number1 = number1EditText.text.toString()
            val number2 = number2EditText.text.toString()

            if (number1.isNotEmpty() && number2.isNotEmpty()) {
                // Swapping logic
                val temp = number1
                number1EditText.setText(number2)
                number2EditText.setText(temp)

                // Display the swapped numbers
                resultTextView.text = "Swapped Numbers:\nNumber 1: $number2\nNumber 2: $number1"
            } else {
                resultTextView.text = "Please enter both numbers"
            }
        }
    }
}
