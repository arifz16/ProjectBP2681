package com.example.projectbp2681

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val imgCall:ImageView = findViewById(R.id.imageViewCall)

        imgCall.setOnClickListener {
            val callIntent:Intent = Uri.parse("tel:085679835").let { number -> Intent(Intent.ACTION_DIAL,number)  }
        }
    }
}