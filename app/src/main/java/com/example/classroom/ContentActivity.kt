package com.example.classroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_content.*
import kotlinx.android.synthetic.main.activity_main.*

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        buttonKny.setOnClickListener {
            val intent = Intent(this, KnyActivity::class.java)
            startActivity(intent)
        }

        buttonNaruto.setOnClickListener {
            val intent = Intent(this, NarutoActivity::class.java)
            startActivity(intent)
        }

        buttonAot.setOnClickListener {
            val intent = Intent(this, AotActivity::class.java)
            startActivity(intent)
        }
    }
}