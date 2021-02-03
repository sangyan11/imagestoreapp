package com.example.images

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImageSlider : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_slider)





        var images=arrayOf(R.drawable.cric1,R.drawable.cric2,R.drawable.cric32,R.drawable.cric4)
        var index=0

        var imageslider = findViewById<ImageView>(R.id.image_slide);
        var next_button = findViewById<Button>(R.id.next_btn);
        var prevous_button = findViewById<Button>(R.id.Previous_btn);
        next_button.setOnClickListener {
            if(index==images.size-1) {
              index=0;
            }
            index++
            imageslider.setImageResource(images[index])
        }
        prevous_button.setOnClickListener {
            if(index==0) {
                index=images.size;
            }
            index--
            imageslider.setImageResource(images[index])

        }

    }
}