package com.example.diceroller

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    var currentDiceNumber = 0
    var currentDiceNumber2 = 0
    var currentDiceNumber3 = 0
    lateinit var  diceImage:ImageView
    lateinit var  diceImage2:ImageView
    lateinit var  diceImage3:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button) //locate the button created with ID
        rollButton.setOnClickListener { rollDice() } //set event to the button
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)

        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener{countUpDice()}

        val rollButton3: Button = findViewById(R.id.roll_button3)
        rollButton3.setOnClickListener{resetDice()}
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

        currentDiceNumber = getRandomDiceImage()
        diceImage.setImageResource(getDrawableImage(currentDiceNumber))
        currentDiceNumber2 = getRandomDiceImage()
        diceImage2.setImageResource(getDrawableImage(currentDiceNumber2))
        currentDiceNumber3 = getRandomDiceImage()
        diceImage3.setImageResource(getDrawableImage(currentDiceNumber3))

        //Toast is a view that shows a simple message in a small popup window.
        //A duration, for example (Toast.LENGTH_SHORT)
        //to display call "show()"
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show() //text<button clicked> displayed when button clicked
    }
    private fun getRandomDiceImage():Int{
        val randomInt = Random().nextInt(6) + 1
        return randomInt
    }

    private fun getDrawableImage(x:Int):Int{
        return when (x) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun countUpDice(){
        currentDiceNumber++
        diceImage.setImageResource(getDrawableImage(currentDiceNumber))
        currentDiceNumber2++
        diceImage2.setImageResource(getDrawableImage(currentDiceNumber2))
        currentDiceNumber3++
        diceImage3.setImageResource(getDrawableImage(currentDiceNumber3))
    }

    private fun resetDice(){
        currentDiceNumber = 0
        currentDiceNumber2 = 0
        currentDiceNumber3 = 0
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
        diceImage3.setImageResource(R.drawable.empty_dice)
    }
}
