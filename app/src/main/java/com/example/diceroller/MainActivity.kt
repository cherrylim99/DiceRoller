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

        val rollButton3: Button = findViewById(R.id.roll_button3)
        rollButton3.setOnClickListener { rollDice3() }
    }

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        /* resultText.text = "Dice Rolled!" //temporary string which temporary changed the text "Hello World!" -> "Dice Rolled!"
        */
        val randomInt = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()

        //Toast is a view that shows a simple message in a small popup window.
        //A duration, for example (Toast.LENGTH_SHORT)
        //to display call "show()"
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show() //text<button clicked> displayed when button clicked
    }

    private fun rollDice2(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
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

        if (resultText2.text == "Hello World 2!")
        {
            resultText2.text = "1"
        }
        else
        {
            var resultInt2 = resultText2.text.toString().toInt()

            if (resultInt2 < 6) {
                resultInt2++
                resultText2.text = resultInt2.toString()
            }
        }

        if (resultText3.text == "Hello World 3!")
        {
            resultText3.text = "1"
        }
        else
        {
            var resultInt3 = resultText3.text.toString().toInt()

            if (resultInt3 < 6) {
                resultInt3++
                resultText3.text = resultInt3.toString()
            }
        }
    }

    private fun rollDice3(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        resultText.text = "0"
        resultText2.text = "0"
        resultText3.text = "0"
    }
}
