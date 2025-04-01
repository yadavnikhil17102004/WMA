package com.example.seta5

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

        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val buttonCheck = findViewById<Button>(R.id.buttonCheck)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonCheck.setOnClickListener {
            val number = editTextNumber.text.toString().toIntOrNull()
            if (number == null) {
                textViewResult.text = "Please enter a valid number"
            } else {
                var isPrime = true
                if (number < 2) {
                    isPrime = false
                } else {
                    for (i in 2 until number) {
                        if (number % i == 0) {
                            isPrime = false
                            break
                        }
                    }
                }
                textViewResult.text = if (isPrime) "$number is a Prime Number" else "$number is not a Prime Number"
            }
        }
    }
}
