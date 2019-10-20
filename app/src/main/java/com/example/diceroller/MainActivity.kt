package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button) //locate the button created with ID
        rollButton.setOnClickListener { rollDice() } //set event to the button

        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener { rollDice2() }
    }

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        /* resultText.text = "Dice Rolled!" //temporary string which temporary changed the text "Hello World!" -> "Dice Rolled!"
        */
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()


        //Toast is a view that shows a simple message in a small popup window.
        //A duration, for example (Toast.LENGTH_SHORT)
        //to display call "show()"
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show() //text<button clicked> displayed when button clicked
    }

    private fun rollDice2(){
        val resultText: TextView = findViewById(R.id.result_text)

        //If text is "Hello World!" set that text to 1
        if (resultText.text == "Hello World!")
        {
            resultText.text = "1"
        }
        else
        {
            //if not then increment the number 1 by 1 until to 6(maximum)
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}
