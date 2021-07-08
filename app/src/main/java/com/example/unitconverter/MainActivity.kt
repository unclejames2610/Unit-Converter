package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextValue = findViewById<TextView>(R.id.editTextValue)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)
        lateinit var selectedItemSpinner1 : String
        lateinit var selectedItemSpinner2 : String

        val adapter = ArrayAdapter.createFromResource(this, R.array.unit_list, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        spinner1.adapter = adapter
        spinner2.adapter = adapter
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                selectedItemSpinner1 = parent?.getItemAtPosition(position).toString()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               selectedItemSpinner2 = parent?.getItemAtPosition(position).toString()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        btnConvert.setOnClickListener {
            if (selectedItemSpinner1 == "Kg" && selectedItemSpinner2 == "Lbs"){
                val answer = (editTextValue.text.toString().toDouble() * 2.205)
                val roundAnswer = String.format("%.2f", answer)
                textViewDisplay.text = roundAnswer + " lbs"

            }
            else if (selectedItemSpinner1 == "Lbs" && selectedItemSpinner2 == "Kg"){
                val answer = (editTextValue.text.toString().toDouble() / 2.205)
                val roundAnswer = String.format("%.2f", answer)
                textViewDisplay.text = roundAnswer + " kg"

            }
            else if (selectedItemSpinner1 == "Kg" && selectedItemSpinner2 == "Kg"){
                textViewDisplay.text = editTextValue.text.toString() + " kg"
            }
            else if (selectedItemSpinner1 == "Lbs" && selectedItemSpinner2 == "Lbs"){
                textViewDisplay.text = editTextValue.text.toString() + " lbs"
            }
            else if (selectedItemSpinner1 == "cm" && selectedItemSpinner2 == "m"){
                val answer = editTextValue.text.toString().toDouble() * 0.01
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " m"
            }
            else if (selectedItemSpinner1 == "m" && selectedItemSpinner2 == "cm"){
                val answer = editTextValue.text.toString().toDouble() * 100
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " cm"
            }
            else if (selectedItemSpinner1 == "cm" && selectedItemSpinner2 == "cm"){
                textViewDisplay.text = editTextValue.text.toString() + " cm"
            }
            else if (selectedItemSpinner1 == "m" && selectedItemSpinner2 == "m"){
                textViewDisplay.text = editTextValue.text.toString() + " m"
            }
            else if (selectedItemSpinner1 == "in" && selectedItemSpinner2 == "ft"){
                val answer = editTextValue.text.toString().toDouble() / 12
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " ft"
            }
            else if (selectedItemSpinner1 == "ft" && selectedItemSpinner2 == "in"){
                val answer = editTextValue.text.toString().toDouble() * 12
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " in"
            }
            else if (selectedItemSpinner1 == "in" && selectedItemSpinner2 == "in"){
                textViewDisplay.text = editTextValue.text.toString() + " in"
            }
            else if (selectedItemSpinner1 == "ft" && selectedItemSpinner2 == "ft"){
                textViewDisplay.text = editTextValue.text.toString() + " ft"
            }
            else if (selectedItemSpinner1 == "in" && selectedItemSpinner2 == "cm"){
                val answer = editTextValue.text.toString().toDouble() * 2.54
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " cm"
            }
            else if (selectedItemSpinner1 == "cm" && selectedItemSpinner2 == "in"){
                val answer = editTextValue.text.toString().toDouble() / 2.54
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " in"
            }
            else if (selectedItemSpinner1 == "in" && selectedItemSpinner2 == "m"){
                val answer = editTextValue.text.toString().toDouble() /  39.37
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " m"
            }
            else if (selectedItemSpinner1 == "m" && selectedItemSpinner2 == "in"){
                val answer = editTextValue.text.toString().toDouble() * 39.37
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " in"
            }
            else if (selectedItemSpinner1 == "cm" && selectedItemSpinner2 == "ft"){
                val answer = editTextValue.text.toString().toDouble() / 30.48
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " ft"
            }
            else if (selectedItemSpinner1 == "ft" && selectedItemSpinner2 == "cm"){
                val answer = editTextValue.text.toString().toDouble() * 30.48
                val roundAnswer = String.format("%2f", answer)
                textViewDisplay.text = roundAnswer + " cm"
            }




        }

        }


    }
