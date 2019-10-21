package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var  diceImage:ImageView
    lateinit var  diceImage2:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button) //locate the button created with ID
        rollButton.setOnClickListener { rollDice() } //set event to the button
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
    }

    private fun rollDice(){
        /*val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText.text = "Dice Rolled!" //temporary string which temporary changed the text "Hello World!" -> "Dice Rolled!"
        resultText.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()
        */

        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

        //Toast is a view that shows a simple message in a small popup window.
        //A duration, for example (Toast.LENGTH_SHORT)
        //to display call "show()"
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show() //text<button clicked> displayed when button clicked
    }
    private fun getRandomDiceImage():Int{
        val randomInt = Random().nextInt(6) + 1
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
