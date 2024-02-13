package com.example.nicoletranwgnactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val logTag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(logTag, "onCreate() called")

        val helloButton: Button = findViewById(R.id.hello_button)
        val editText: EditText = findViewById(R.id.edit_text)
        val textView: TextView = findViewById(R.id.text_view)

        helloButton.setOnClickListener {
            editText.setText(getString(R.string.hello))
            textView.text = getString(R.string.hello)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(logTag, "onStart() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(logTag, "onRestart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(logTag, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(logTag, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(logTag, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(logTag, "onDestroy() called")
    }
}