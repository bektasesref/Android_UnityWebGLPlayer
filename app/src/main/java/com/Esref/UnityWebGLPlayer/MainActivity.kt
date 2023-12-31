package com.Esref.UnityWebGLPlayer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playGameButton = findViewById<FloatingActionButton>(R.id.playGameButton)
        playGameButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, GameActivity::class.java))
        }
    }
}