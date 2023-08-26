package com.devcarlosramos.libretamagica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)

        btnStart.setOnClickListener {
            var randomInRange:Int = Random.nextInt(0, 2)
            val name:String = if (randomInRange==1) "GANASTE" else "PERDISTE"
            Log.i("random","$randomInRange")

            if (name.isNotEmpty()) {
                val intent = Intent(this, MainActivitySegundo::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

    }
}