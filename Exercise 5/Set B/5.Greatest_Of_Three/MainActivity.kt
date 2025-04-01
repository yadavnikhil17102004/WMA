package com.example.setb5

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
        val number3EditText: EditText = findViewById(R.id.number3EditText)
        val checkButton: Button = findViewById(R.id.checkButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Set up the button click listener
        checkButton.setOnClickListener {
            val number1 = number1EditText.text.toString()
            val number2 = number2EditText.text.toString()
            val number3 = number3EditText.text.toString()

            if (number1.isNotEmpty() && number2.isNotEmpty() && number3.isNotEmpty()) {
                val num1 = number1.toInt()
                val num2 = number2.toInt()
                val num3 = number3.toInt()

                // Determine the greatest number
                val greatest = when {
                    num1 >= num2 && num1 >= num3 -> num1
                    num2 >= num1 && num2 >= num3 -> num2
                    else -> num3
                }

                resultTextView.text = "The greatest number is: $greatest"
            } else {
                resultTextView.text = "Please enter all three numbers"
            }
        }
    }
}
