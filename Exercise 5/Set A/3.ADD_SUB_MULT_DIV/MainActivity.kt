package com.example.set3a

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1EditText = findViewById(R.id.number1)
        num2EditText = findViewById(R.id.number2)
        resultTextView = findViewById(R.id.resultTextView)

        findViewById<Button>(R.id.addButton).setOnClickListener {
            val num1 = num1EditText.text.toString().toDoubleOrNull()
            val num2 = num2EditText.text.toString().toDoubleOrNull()

            resultTextView.text = if (num1 != null && num2 != null) {
                "Result: ${num1 + num2}"
            } else {
                "Invalid input"
            }
        }

        findViewById<Button>(R.id.subtractButton).setOnClickListener {
            val num1 = num1EditText.text.toString().toDoubleOrNull()
            val num2 = num2EditText.text.toString().toDoubleOrNull()

            resultTextView.text = if (num1 != null && num2 != null) {
                "Result: ${num1 - num2}"
            } else {
                "Invalid input"
            }
        }

        findViewById<Button>(R.id.multiplyButton).setOnClickListener {
            val num1 = num1EditText.text.toString().toDoubleOrNull()
            val num2 = num2EditText.text.toString().toDoubleOrNull()

            resultTextView.text = if (num1 != null && num2 != null) {
                "Result: ${num1 * num2}"
            } else {
                "Invalid input"
            }
        }

        findViewById<Button>(R.id.divideButton).setOnClickListener {
            val num1 = num1EditText.text.toString().toDoubleOrNull()
            val num2 = num2EditText.text.toString().toDoubleOrNull()

            resultTextView.text = if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    "Result: ${num1 / num2}"
                } else {
                    "Cannot divide by zero"
                }
            } else {
                "Invalid input"
            }
        }
    }
}
