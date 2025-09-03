package com.example.lab_week_02_c

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Button
import android.content.Intent
import android.view.View

class StandardActivity : AppCompatActivity() {
    companion object{
        private const val DEBUG = "DEBUG"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)
        Log.d(DEBUG, "onCreate")
        findViewById<Button>(R.id.button_standard).setOnClickListener{
            startActivity(
                Intent(this,
                    StandardActivity::class.java)
            )
        }
    }
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent")
    }
}