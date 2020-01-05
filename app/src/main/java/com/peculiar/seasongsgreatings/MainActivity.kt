package com.peculiar.seasongsgreatings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            button2()
        }
        imageView = findViewById(R.id.imageView3)

    }

    private fun button2() {
        val randomInt = Random.nextInt(13) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.season12
            2 -> R.drawable.season1
            3 -> R.drawable.season2
            4 -> R.drawable.season3
            5 -> R.drawable.season4
            6 -> R.drawable.season6
            7 -> R.drawable.season7
            8 -> R.drawable.season8
            9 -> R.drawable.season14
            10 -> R.drawable.season5
            11 -> R.drawable.season9
            12 -> R.drawable.season11
            13 -> R.drawable.season10
            else -> R.drawable.season13
        }
        imageView.setImageResource(drawableResource)
    }

}
