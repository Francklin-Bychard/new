package com.example.bychard

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)
        val flashcardCorrection1 = findViewById<TextView>(R.id.flashcard_correction1)
        val flashcardCorrection2 = findViewById<TextView>(R.id.flashcard_correction2)
        flashcardAnswer1.setOnClickListener {
            flashcardQuestion. visibility = View. VISIBLE
            flashcardAnswer1.visibility = View.VISIBLE
            flashcardAnswer2.visibility = View.INVISIBLE
            flashcardAnswer3.visibility = View.INVISIBLE
            flashcardCorrection1.visibility = View.VISIBLE
            flashcardCorrection2.visibility = View.INVISIBLE
            }

        flashcardAnswer2.setOnClickListener {
            flashcardQuestion. visibility = View. VISIBLE
            flashcardAnswer1. visibility = View. INVISIBLE
            flashcardAnswer2. visibility = View. VISIBLE
            flashcardAnswer3. visibility = View. INVISIBLE
            flashcardCorrection1.visibility = View. INVISIBLE
            flashcardCorrection2. visibility = View. VISIBLE
        }

        flashcardAnswer3.setOnClickListener {
            flashcardQuestion. visibility = View. VISIBLE
            flashcardAnswer1. visibility = View. INVISIBLE
            flashcardAnswer2. visibility = View. INVISIBLE
            flashcardAnswer3. visibility = View. VISIBLE
            flashcardCorrection1. visibility = View. INVISIBLE
            flashcardCorrection2. visibility = View. VISIBLE
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}