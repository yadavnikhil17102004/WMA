package com.example.setb3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val classEditText: EditText = findViewById(R.id.classEditText)
        val hobbiesEditText: EditText = findViewById(R.id.hobbiesEditText)
        val submitButton: Button = findViewById(R.id.submitButton)

        // Set up the button click listener
        submitButton.setOnClickListener {
            val studentName = nameEditText.text.toString()
            val studentClass = classEditText.text.toString()
            val studentHobbies = hobbiesEditText.text.toString()

            if (studentName.isNotEmpty() && studentClass.isNotEmpty() && studentHobbies.isNotEmpty()) {
                val message = "Name: $studentName\nClass: $studentClass\nHobbies: $studentHobbies"
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please fill out all fields!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
