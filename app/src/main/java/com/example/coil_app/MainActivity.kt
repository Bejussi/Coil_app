package com.example.coil_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import coil.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch_image.setOnCheckedChangeListener { _, b ->
            if (b) {
                Toast.makeText(this,"First image load",Toast.LENGTH_LONG).show()
                imageView.load("https://upload.wikimedia.org/wikipedia/uk/1/18/Cuphead_icon.jpg")
            }
            else {
                Toast.makeText(this,"Second image load",Toast.LENGTH_LONG).show()
                imageView.load("https://bonduelle.ru/upload/medialibrary/81f/81fb1f09e1159ffcf8a6f89a3848bfee.jpg")
            }
        }
    }
}