package com.example.gcd

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val button = findViewById<Button>(R.id.button)
        val result = findViewById<TextView>(R.id.result)

        button.setOnClickListener {
            try {
                val n1 = num1.text.toString().toInt()
                val n2 = num2.text.toString().toInt()
                val gcdResult = gcd(n1, n2)
                result.text = "GCD of $n1 and $n2 is $gcdResult"
            } catch (e: NumberFormatException) {
                result.text = "Please enter valid numbers."
            }
        }
    }

    // Simple GCD using Euclidean Algorithm
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
