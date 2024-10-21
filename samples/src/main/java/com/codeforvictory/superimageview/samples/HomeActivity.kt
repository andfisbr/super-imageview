package com.codeforvictory.superimageview.samples

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.codeforvictory.superimageview.samples.databinding.ActivityHomeBinding
import com.codeforvictory.superimageview.samples.image_cropping.ImageCroppingActivity
import com.codeforvictory.superimageview.samples.image_cropping.NetworkImageCroppingActivity
import com.codeforvictory.superimageview.samples.rounded_corners.RoundedCornerImagesActivity

class HomeActivity: AppCompatActivity() {
        private lateinit var binding: ActivityHomeBinding

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityHomeBinding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.imageCropping.setOnClickListener { view: View? ->
                        startActivity(Intent(this, ImageCroppingActivity::class.java))
                }

                binding.imageCroppingNetwork.setOnClickListener { view: View? ->
                        startActivity(Intent(this, NetworkImageCroppingActivity::class.java))
                }

                binding.roundedCorners.setOnClickListener { view: View? ->
                        startActivity(Intent(this, RoundedCornerImagesActivity::class.java))
                }
        }
}
