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
        var edge = findViewById<EditText>(R.id.edge)
        var value_user = findViewById<EditText>(R.id.value_user)

    }
}