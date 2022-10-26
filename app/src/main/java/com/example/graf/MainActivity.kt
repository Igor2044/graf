package com.example.graf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var show_path = findViewById<Button>(R.id.show_path)
        var vertex = findViewById<EditText>(R.id.vertex)
    }
}