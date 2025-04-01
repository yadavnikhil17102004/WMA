package com.example.seta4

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        val radioGroupGender : RadioGroup = findViewById(R.id.radioGroupGender)
        val checkBoxReading: CheckBox = findViewById (R.id.checkBoxReading)
        val checkBoxGaming : CheckBox = findViewById(R.id.checkBoxGaming)
        val checkBoxTraveling: CheckBox= findViewById (R.id.checkBoxTraveling)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val txtResult: TextView = findViewById(R.id.txtResult)

        // Set button click listener
        btnSubmit.setOnClickListener {
            // Get selected radio button
            val selectedGenderId = radioGroupGender.checkedRadioButtonId
            val selectedGender = if (selectedGenderId != -1) {
                findViewById<RadioButton>(selectedGenderId).text.toString()
            } else {
                "No Gender Selected"
            }

            // Get selected checkboxes
            val hobbies = mutableListOf<String>()
            if (checkBoxReading.isChecked) hobbies.add("Reading")
            if (checkBoxGaming.isChecked) hobbies.add("Gaming")
            if (checkBoxTraveling.isChecked) hobbies.add("Traveling")

            // Display the result
            val hobbiesText = if (hobbies.isNotEmpty()) hobbies.joinToString(", ") else "No Hobbies Selected"
            txtResult.text = "Gender: $selectedGender\nHobbies: $hobbiesText"
        }
    }
}
