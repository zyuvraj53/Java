package com.androidpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val rollButton = findViewById<Button>(R.id.rollButton);
        val resultTextView = findViewById<TextView>(R.id.resultTextView);
        val seekBar = findViewById<SeekBar>(R.id.seekBar);

        rollButton.setOnClickListener {
            val rand = Random().nextInt(seekBar.progress) + 1;
            resultTextView.text = rand.toString();
        }
    }
}