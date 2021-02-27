package com.example.habit_tracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //var Button1: Button =findViewById(R.id.daily)
    //var Button2: Button =findViewById(R.id.weekly)
    //var Button3: Button =findViewById(R.id.monthly)
    //var TextView:TextView =findViewById(R.id.goal)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var Button1=findViewById<Button>(R.id.daily)
        var Button2=findViewById<Button>(R.id.weekly)
        var Button3=findViewById<Button>(R.id.monthly)
        var TextView=findViewById<TextView>(R.id.goal)
        Button1.setOnClickListener {
            TextView.text="PER Day"
        }
        Button2.setOnClickListener {
            TextView.text="PER Week"
        }
        Button3.setOnClickListener {
            TextView.text="PER Month"
        }
    }



}